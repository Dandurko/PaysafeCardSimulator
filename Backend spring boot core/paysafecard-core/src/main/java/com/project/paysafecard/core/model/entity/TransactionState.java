package com.project.paysafecard.core.model.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "transaction_states")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 100,unique = true)
    @Nonnull
    private String state;

    @OneToMany(mappedBy = "oldTransactionState" )
    private List<TransactionLog> oldTransactionLogs;

    @OneToMany(mappedBy = "newTransactionState" )
    private List<TransactionLog> newTransactionLogs;

    @OneToMany(mappedBy = "transactionState" )
    private List<Transaction> transactions;

}
