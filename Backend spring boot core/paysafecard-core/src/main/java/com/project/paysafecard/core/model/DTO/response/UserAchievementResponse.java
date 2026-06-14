package com.project.paysafecard.core.model.DTO.response;

import com.project.paysafecard.core.model.entity.Achievement;
import com.project.paysafecard.core.model.entity.UserAchievement;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserAchievementResponse {

    private int totalAchievementsQuantity;

    private int achievedAchievementsQuantity;

    @NotNull
    private List<Achievement> achievedAchievements;

    private boolean allAchieved;
}
