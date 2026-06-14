package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.Achievement;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.repository.AchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementServiceImpl implements AchievementService{

    @Autowired
    private AchievementRepository achievementRepository;

    @Override
    public List<Achievement> findAll() {
        return achievementRepository.findAll();
    }

}
