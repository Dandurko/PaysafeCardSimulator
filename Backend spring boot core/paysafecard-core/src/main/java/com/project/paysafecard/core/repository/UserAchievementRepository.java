package com.project.paysafecard.core.repository;

import com.project.paysafecard.core.model.entity.Achievement;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.model.entity.UserAchievement;
import com.project.paysafecard.core.model.entity.UserAchievementId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAchievementRepository extends JpaRepository<UserAchievement, UserAchievementId> {
    @Query("SELECT userAchievement.achievement FROM UserAchievement userAchievement where userAchievement.user =?1")
    List<Achievement> findAllByUser(User user);
}
