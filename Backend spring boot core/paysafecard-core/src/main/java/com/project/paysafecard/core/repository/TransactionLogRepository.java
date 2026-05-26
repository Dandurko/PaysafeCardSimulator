package com.project.paysafecard.core.repository;

import com.project.paysafecard.core.model.entity.TransactionLog;
import com.project.paysafecard.core.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TransactionLogRepository extends JpaRepository<TransactionLog, UUID> {

    @Query("SELECT transactionLog from TransactionLog transactionLog where transactionLog.user = ?1")
    List<TransactionLog> findAllByUser(User user);
}
