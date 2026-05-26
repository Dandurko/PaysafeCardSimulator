package com.project.paysafecard.core.service.jpaService;

import com.project.paysafecard.core.model.entity.TransactionLog;
import com.project.paysafecard.core.model.entity.User;

import java.util.List;

public interface TransactionLogService {

    void save(TransactionLog transactionLog);
    List<TransactionLog> findAllByUser(User user);

}
