package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.Achievement;

import java.util.List;

public interface AchievementService {
    List<Achievement> findAll();

}
