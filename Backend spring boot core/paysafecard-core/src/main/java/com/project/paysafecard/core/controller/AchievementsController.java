package com.project.paysafecard.core.controller;

import com.project.paysafecard.core.model.DTO.response.UserAchievementResponse;
import com.project.paysafecard.core.model.entity.Achievement;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.model.entity.UserAchievement;
import com.project.paysafecard.core.repository.AchievementRepository;
import com.project.paysafecard.core.repository.UserRepository;
import com.project.paysafecard.core.service.jpa.AchievementService;
import com.project.paysafecard.core.service.jpa.UserAchievementsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/achievements")
public class AchievementsController {

    @Autowired
    private UserAchievementsServiceImpl userAchievementsService;

    @Autowired
    private AchievementRepository achievementRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/fetchAllByUser")
    public UserAchievementResponse achievements() {

        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        User user = userRepository.findUserByEmail(userDetails.getUsername());

        List<Achievement> userAchievements = userAchievementsService.findAchievementsByUser(user);
        List<Achievement> achievements = achievementRepository.findAll();

        int userAchievementsAchievedCount = userAchievements.size();
        int allAchievementsCount = achievements.size();
        boolean allAchieved= userAchievementsAchievedCount==allAchievementsCount;
        UserAchievementResponse userAchievementResponse= new UserAchievementResponse();

        userAchievementResponse.setAchievedAchievementsQuantity(userAchievementsAchievedCount);
        userAchievementResponse.setTotalAchievementsQuantity(allAchievementsCount);
        userAchievementResponse.setAllAchieved(allAchieved);
        userAchievementResponse.setAchievedAchievements(userAchievements);

        return userAchievementResponse;

    }

}
