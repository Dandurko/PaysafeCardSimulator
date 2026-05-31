package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.AuditLog;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.repository.AuditLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditLogServiceImpl implements AuditLogService{

    @Autowired
    private AuditLogRepository auditLogRepository;

    @Override
    public void save(AuditLog auditLog) {

        auditLogRepository.save(auditLog);

    }

    @Override
    public List<AuditLog> findAllByUser(User user) {
        return auditLogRepository.findAllByUser(user);
    }
}
