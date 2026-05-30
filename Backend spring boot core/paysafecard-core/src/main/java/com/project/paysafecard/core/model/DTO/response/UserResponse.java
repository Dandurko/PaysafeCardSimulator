package com.project.paysafecard.core.model.DTO.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

public record UserResponse (@NotBlank @Size(min = 3, max = 50) String firstName,@NotBlank @Size(min = 3, max = 50) String lastName,@NotBlank @Email String email, @NotNull BigDecimal balance, @NotNull LocalDate dateOfBirth) {

}
