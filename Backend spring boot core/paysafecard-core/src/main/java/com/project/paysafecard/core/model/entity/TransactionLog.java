package com.project.paysafecard.core.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "transaction_logs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionLog extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "user_uuid",referencedColumnName = "uuid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "old_transaction_state_id",referencedColumnName = "id")
    private TransactionState oldTransactionState;

    @ManyToOne
    @JoinColumn(name = "new_transaction_state_id",referencedColumnName = "id")
    private TransactionState newTransactionState;

    @ManyToOne
    @JoinColumn(name = "transaction_uuid",referencedColumnName = "uuid")
    private Transaction transaction;


}
