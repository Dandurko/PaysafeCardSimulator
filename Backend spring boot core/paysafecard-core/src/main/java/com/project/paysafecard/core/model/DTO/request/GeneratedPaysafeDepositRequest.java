package com.project.paysafecard.core.model.DTO.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record GeneratedPaysafeDepositRequest(@NotBlank @Size(min = 16,max = 16) String paysafeNumber){
}
