package com.project.paysafecard.core.repository;

import com.project.paysafecard.core.model.entity.AuditLog;
import com.project.paysafecard.core.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, UUID> {

    @Query("SELECT auditLog from AuditLog auditLog where auditLog.user = ?1")
    List<AuditLog> findAllByUser(User user);
}
