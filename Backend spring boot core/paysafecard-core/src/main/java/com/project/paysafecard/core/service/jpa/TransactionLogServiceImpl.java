package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.TransactionLog;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.repository.TransactionLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionLogServiceImpl implements TransactionLogService{

    @Autowired
    private TransactionLogRepository transactionLogRepository;

    @Override
    public void save(TransactionLog transactionLog) {

        transactionLogRepository.save(transactionLog);

    }

    @Override
    public List<TransactionLog> findAllByUser(User user) {
        return transactionLogRepository.findAllByUser(user);
    }
}
