package com.project.paysafecard.core.service.business;

import com.project.paysafecard.core.mapper.UserMapper;
import com.project.paysafecard.core.model.DTO.request.UserLoginRequest;
import com.project.paysafecard.core.model.DTO.request.UserRegisterRequest;
import com.project.paysafecard.core.model.DTO.response.UserResponse;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.service.jpa.UserService;
import jakarta.persistence.EntityExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncode;

    @Override
    public UserResponse register(UserRegisterRequest userRegisterRequest) {
        Optional<User> optionalUser = userService.findUserByEmail(userRegisterRequest.email());

        if (optionalUser.isPresent()) {
            throw new EntityExistsException();
        }

        User user = UserMapper.fromUserRegisterToUser(userRegisterRequest);

        user.setPasswordHash(passwordEncode.encode(userRegisterRequest.password()));
        userService.save(user);

        return UserMapper.toResponse(user);
    }
}
