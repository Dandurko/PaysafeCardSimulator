package com.project.paysafecard.core.model.DTO.response;

import com.project.paysafecard.core.model.entity.GeneratedPaysafe;
import com.project.paysafecard.core.model.entity.PaysafeState;
import com.project.paysafecard.core.model.entity.User;

public record PaysafeLog (User user, PaysafeState oldPaysafeState, PaysafeState newPaysafeState, GeneratedPaysafe generatedPaysafe){
}
