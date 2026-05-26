package com.project.paysafecard.core.service.jpaService;

import com.project.paysafecard.core.model.entity.Transaction;
import com.project.paysafecard.core.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void save(Transaction transaction) {

        transactionRepository.save(transaction);

    }
}
