package com.project.paysafecard.core.model.DTO.response;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record PaysafeCardRedeemResponse (@NotBlank BigDecimal userBalance, @NotBlank BigDecimal paysafeCardBalance){
}

