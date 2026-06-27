package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.Transaction;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void save(Transaction transaction) {

        transactionRepository.save(transaction);

    }

    @Override
    public List<Transaction> findAllByUser(User user) {
        return transactionRepository.findAllByUser(user);
    }
}
