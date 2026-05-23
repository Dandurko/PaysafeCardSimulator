package com.project.paysafecard.core.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Entity
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction extends BaseEntity{

    @Column(precision = 10  , scale = 2,nullable = false)
    @ColumnDefault("0")
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "user_uuid",referencedColumnName = "uuid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "generated_paysafe_uuid",referencedColumnName = "uuid")
    private GeneratedPaysafe generatedPaysafe;

    @ManyToOne
    @JoinColumn(name = "transaction_state_id",referencedColumnName = "id")
    private TransactionState transactionState;
}
