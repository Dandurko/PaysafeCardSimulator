package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.Transaction;
import com.project.paysafecard.core.model.entity.User;

import java.util.List;

public interface TransactionService {
    void save(Transaction transaction);
    List<Transaction> findAllByUser(User user);
}
