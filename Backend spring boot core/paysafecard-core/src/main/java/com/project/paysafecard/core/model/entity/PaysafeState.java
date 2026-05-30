package com.project.paysafecard.core.model.entity;


import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "paysafe_states")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaysafeState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 100,unique = true)
    @NotNull
    private String state;

    @OneToMany(mappedBy = "paysafeState")
    private List<GeneratedPaysafe> generatedPaysafes;

    @OneToMany(mappedBy = "oldPaysafeState")
    private List<PaysafeLog> logsWithOldPaySafeState;

    @OneToMany(mappedBy = "newPaysafeState")
    private List<PaysafeLog> logsWithNewPaySafeState;
}
