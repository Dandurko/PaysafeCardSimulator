package com.project.paysafecard.core.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "paysafe_log")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaysafeLog extends BaseEntity {

   @ManyToOne
   @JoinColumn(name = "old_paysafe_state",referencedColumnName = "id")
   private PaysafeState oldPaysafeState;

    @ManyToOne
    @JoinColumn(name = "new_paysafe_state",referencedColumnName = "id")
    private PaysafeState newPaysafeState;

    @ManyToOne
    @JoinColumn(name = "generated_paysafe_uuid",referencedColumnName = "uuid")
    private GeneratedPaysafe generatedPaysafe;

    @ManyToOne
    @JoinColumn(name = "user_uuid",referencedColumnName = "uuid")
    private User user;

}
