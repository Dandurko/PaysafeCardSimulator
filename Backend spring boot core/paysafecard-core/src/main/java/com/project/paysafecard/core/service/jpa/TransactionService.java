package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.Transaction;

public interface TransactionService {
    void save(Transaction transaction);
}
