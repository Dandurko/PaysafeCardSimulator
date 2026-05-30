package com.project.paysafecard.core.model.DTO.response;

import com.project.paysafecard.core.model.entity.AuditLogType;
import com.project.paysafecard.core.model.entity.Transaction;
import com.project.paysafecard.core.model.entity.TransactionState;
import com.project.paysafecard.core.model.entity.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record AuditLogResponse (@NotNull User user, @NotNull AuditLogType auditLogType, @NotBlank @Size(min = 3, max = 255) String description){
}
