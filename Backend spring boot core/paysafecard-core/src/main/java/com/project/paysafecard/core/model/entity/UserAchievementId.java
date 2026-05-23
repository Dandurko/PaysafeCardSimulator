package com.project.paysafecard.core.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserAchievementId implements Serializable {


    @Column(name = "user_uuid")
    private UUID userId;

    @Column(name = "achievement_id")
    private int achievementId;

}
