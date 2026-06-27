package com.project.paysafecard.core.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "generated_paysafe")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GeneratedPaysafe extends BaseEntity{

    @Column(name = "paysafe_number_hash" , unique = true)
    @NotNull
    private String paysafeNumberHash;

    @Column(name = "valid_till",nullable = false)
    @NotNull
    private LocalDateTime validTill;

    @Column(precision = 10 , scale = 2,nullable = false)
    @ColumnDefault("0")
    private BigDecimal amount = BigDecimal.ZERO;

    @Column(name = "is_redeemed",nullable = false)
    @ColumnDefault("false")
    private boolean isRedeemed;

    @Column(name = "redeemed_at")
    private LocalDateTime redeemedAt;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE},fetch = FetchType.LAZY)
    @JoinColumn(name = "paysafe_state_id",referencedColumnName = "id")
    private PaysafeState paysafeState;

    @OneToMany(mappedBy = "generatedPaysafe")
    private List<PaysafeLog> paysafeLogs;

    @OneToMany(mappedBy = "generatedPaysafe")
    private List<Transaction> transactions;


}


