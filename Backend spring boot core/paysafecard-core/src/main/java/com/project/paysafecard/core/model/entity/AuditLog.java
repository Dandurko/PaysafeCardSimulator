package com.project.paysafecard.core.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "audit_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuditLog extends BaseEntity{

    @ManyToOne
    @JoinColumn(name="users_uuid",referencedColumnName = "uuid")
    private User user;

    @ManyToOne
    @JoinColumn(name="audit_log_type_id",referencedColumnName = "id")
    private AuditLogType auditLogType;

    @Column
    @NotNull
    private String description;



}
