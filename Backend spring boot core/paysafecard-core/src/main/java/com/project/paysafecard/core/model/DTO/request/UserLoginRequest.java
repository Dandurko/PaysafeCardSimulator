package com.project.paysafecard.core.model.DTO.request;

public record UserLoginRequest(String email, String password) {
    @Override
    public String toString() {
        return "UserRequest{" +
                "email='" + email + '\'' +
                ", password='" + "*****" + '\'' +
                '}';
    }
}
