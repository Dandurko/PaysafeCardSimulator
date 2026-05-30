package com.project.paysafecard.core.model.DTO.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record UserRegisterRequest(@NotBlank @Size(min = 3, max = 50)String firstName, @NotBlank @Size(min = 3, max = 50) String lastName, @NotBlank @Email String email, @NotBlank @Size(min = 14, max = 50) String password,
                                 @NotNull LocalDate dateOfBirth) {
    @Override
    public String toString() {
        return "UserRegisterRequest{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + "*****" + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
