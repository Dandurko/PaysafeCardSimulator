package com.project.paysafecard.core.repository;

import com.project.paysafecard.core.model.entity.Transaction;
import com.project.paysafecard.core.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
    @Query("SELECT transaction from Transaction transaction where transaction.user =?1")
    List<Transaction> findAllByUser(User user);
}
