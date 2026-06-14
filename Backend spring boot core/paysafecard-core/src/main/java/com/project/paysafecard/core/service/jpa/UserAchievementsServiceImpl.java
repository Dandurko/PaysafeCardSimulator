package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.Achievement;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.model.entity.UserAchievement;
import com.project.paysafecard.core.repository.UserAchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAchievementsServiceImpl implements UserAchievementService {

    @Autowired
    private UserAchievementRepository userAchievementRepository;

    @Override
    public List<Achievement> findAchievementsByUser(User user) {
        return userAchievementRepository.findAllByUser(user);
    }
}
