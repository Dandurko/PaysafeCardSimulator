package com.project.paysafecard.core.repository;

import com.project.paysafecard.core.model.entity.AuditLog;
import com.project.paysafecard.core.model.entity.PaysafeLog;
import com.project.paysafecard.core.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PaysafeLogRepository extends JpaRepository<PaysafeLog, UUID> {

    @Query("SELECT paysafeLog from PaysafeLog paysafeLog where paysafeLog.user = ?1")
    List<PaysafeLog> findAllByUser(User user);

}
