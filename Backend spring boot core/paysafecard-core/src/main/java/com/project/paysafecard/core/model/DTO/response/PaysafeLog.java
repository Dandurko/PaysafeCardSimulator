package com.project.paysafecard.core.model.DTO.response;

import com.project.paysafecard.core.model.entity.GeneratedPaysafe;
import com.project.paysafecard.core.model.entity.PaysafeState;
import com.project.paysafecard.core.model.entity.User;
import jakarta.validation.constraints.NotNull;

public record PaysafeLog (@NotNull User user, @NotNull PaysafeState oldPaysafeState, @NotNull PaysafeState newPaysafeState, @NotNull GeneratedPaysafe generatedPaysafe){
}
