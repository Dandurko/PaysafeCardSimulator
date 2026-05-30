package com.project.paysafecard.core.model.DTO.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserLoginRequest(@NotBlank @Email String email,@NotBlank @Size(min = 14,max = 50)  String password) {
    @Override
    public String toString() {
        return "UserRequest{" +
                "email='" + email + '\'' +
                ", password='" + "*****" + '\'' +
                '}';
    }
}
