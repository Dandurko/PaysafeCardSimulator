package com.project.paysafecard.core.model.DTO.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record GeneratedPaysafeResponse(@NotBlank @Size(min = 16,max = 16) String paysafeNumber, @NotNull LocalDateTime validTill){
}
