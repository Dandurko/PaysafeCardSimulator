package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.Achievement;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.model.entity.UserAchievement;

import java.util.List;

public interface UserAchievementService {

    public List<Achievement> findAchievementsByUser(User user);
}
