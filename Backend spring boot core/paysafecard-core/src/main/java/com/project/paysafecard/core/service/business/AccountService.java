package com.project.paysafecard.core.service.business;

import com.project.paysafecard.core.model.DTO.request.UserLoginRequest;
import com.project.paysafecard.core.model.DTO.request.UserRegisterRequest;
import com.project.paysafecard.core.model.DTO.response.UserResponse;
import com.project.paysafecard.core.model.entity.User;

import java.util.Optional;

public interface AccountService {
    UserResponse register(UserRegisterRequest userRegisterRequest);
}
