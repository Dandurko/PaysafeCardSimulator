package com.project.paysafecard.core.mapper;

import com.project.paysafecard.core.model.DTO.request.UserRegisterRequest;
import com.project.paysafecard.core.model.DTO.response.UserResponse;
import com.project.paysafecard.core.model.entity.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public final class UserMapper {

    public static UserResponse toResponse(User user) {
        return new UserResponse(user.getFirstName(), user.getLastName(), user.getEmail(), user.getBalance(), user.getDateOfBirth());
    }

    public static User fromUserRegisterToUser(UserRegisterRequest userRegisterRequest) {
        User user = new User();

        user.setFirstName(userRegisterRequest.firstName());
        user.setLastName(userRegisterRequest.lastName());
        user.setEmail(userRegisterRequest.email());
        user.setDateOfBirth(userRegisterRequest.dateOfBirth());
        return user;
    }


}
