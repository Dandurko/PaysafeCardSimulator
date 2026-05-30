package com.project.paysafecard.core.model.DTO.request;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PaysafeToGenerateRequest(@NotNull BigDecimal amount){
}
