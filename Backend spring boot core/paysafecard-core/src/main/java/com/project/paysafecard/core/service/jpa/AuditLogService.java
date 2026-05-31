package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.AuditLog;
import com.project.paysafecard.core.model.entity.User;

import java.util.List;

public interface AuditLogService {

    void save(AuditLog auditLog);

    List<AuditLog> findAllByUser(User user);

}
