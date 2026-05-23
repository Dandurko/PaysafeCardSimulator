package com.project.paysafecard.core.model.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="audit_log_types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuditLogType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,unique = true,length = 45)
    @Nonnull
    private String type;

    @Column
    private String description;

    @OneToMany(mappedBy = "auditLogType")
    private List<AuditLog> auditLogs;

}
