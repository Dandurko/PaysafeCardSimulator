package com.project.paysafecard.core.service.jpaService;

import com.project.paysafecard.core.model.entity.Transaction;

public interface TransactionService {
    void save(Transaction transaction);
}
