package com.project.paysafecard.core.model.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_achievements")
public class UserAchievement {

    @EmbeddedId
    private UserAchievementId id;

    @ManyToOne(fetch =  FetchType.LAZY)
    @MapsId("userId")
    private User user;

    @ManyToOne(fetch =  FetchType.LAZY)
    @MapsId("achievementId")
    private Achievement achievement;

    @Column(name = "created_at",nullable = false)
    @CreationTimestamp
    private LocalDateTime createdDate;
}
