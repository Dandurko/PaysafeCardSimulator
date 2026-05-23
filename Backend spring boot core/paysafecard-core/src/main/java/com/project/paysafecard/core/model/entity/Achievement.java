package com.project.paysafecard.core.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "achievements")
public class Achievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,unique = true,length = 45)
    private String name;

    @Column(nullable = true)
    private String description;

    @OneToMany(mappedBy = "achievement",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<UserAchievement> users;

}
