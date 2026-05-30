package com.project.paysafecard.core.model.DTO.request;

import java.time.LocalDate;

public record UserRegisterRequest(String firstName, String lastName, String email, String password,
                                  LocalDate dateOfBirth) {
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
