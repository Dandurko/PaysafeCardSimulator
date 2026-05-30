package com.project.paysafecard.core.model.DTO.response;

import com.project.paysafecard.core.model.entity.AuditLogType;
import com.project.paysafecard.core.model.entity.Transaction;
import com.project.paysafecard.core.model.entity.TransactionState;
import com.project.paysafecard.core.model.entity.User;

public record AuditLogResponse (User user, AuditLogType auditLogType, String description){
}
