package com.project.paysafecard.core.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @NotNull
    private String name;

    @Column(nullable = true)
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "achievement",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<UserAchievement> users;

}
