package com.project.paysafecard.core.model.DTO.response;

import java.math.BigDecimal;
import java.time.LocalDate;

public record UserResponse (String firstName, String lastName, String email, BigDecimal balance, LocalDate dateOfBirth) {

}
