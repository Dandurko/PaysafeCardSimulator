package com.project.paysafecard.core.model.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User extends BaseEntity{

    @Column(name="first_name",nullable = false,length = 50)
    @Nonnull
    private String firstName;

    @Column(name="last_name",nullable = false,length = 50)
    @Nonnull
    private String lastName;

    @Column(nullable = false,length = 255,unique = true)
    @Nonnull
    private String email;

    @Column(name="password_hash",nullable = false,length = 255)
    @Nonnull
    private String passwordHash;

    @Column(name="is_active",nullable = false)
    @ColumnDefault("true")
    private boolean isActive;

    @Column(nullable = false,precision = 10,scale = 2)
    private BigDecimal balance;

    @Column(name="date_of_birth",nullable = false)
    private LocalDate dateOfBirth;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private UserRole role;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<UserAchievement> achievements;

    @OneToMany(mappedBy = "user")
    private List<AuditLog> auditLogs;

    @OneToMany(mappedBy = "user")
    private List<PaysafeLog> paysafeLogs;

    @OneToMany(mappedBy = "user")
    private List<TransactionLog> transactionLogs;

    @OneToMany(mappedBy = "user")
    private List<Transaction> transactions;


}
