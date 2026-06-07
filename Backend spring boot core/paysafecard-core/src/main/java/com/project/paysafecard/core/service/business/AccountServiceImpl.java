package com.project.paysafecard.core.service.business;

import com.project.paysafecard.core.mapper.UserMapper;
import com.project.paysafecard.core.model.DTO.request.UserLoginRequest;
import com.project.paysafecard.core.model.DTO.request.UserRegisterRequest;
import com.project.paysafecard.core.model.DTO.response.UserResponse;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.service.jpa.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    UserService userService;

    //TODO:LOGGERS
    @Override
    public UserResponse login(UserLoginRequest userLoginRequest) {

        Optional<User> optionalUser = userService.findUserByEmail(userLoginRequest.email());

        if (optionalUser.isPresent()) {
            // check password
            User user = optionalUser.get();
            return UserMapper.toResponse(user);
        }

        throw new UsernameNotFoundException("Usernam" + userLoginRequest.email() + "e does not exists");
    }

    //TODO:LOGGERS
    @Override
    public UserResponse register(UserRegisterRequest userRegisterRequest) {
        Optional<User> optionalUser = userService.findUserByEmail(userRegisterRequest.email());

        if (optionalUser.isPresent()) {
            //throw an exception that user laready exists
        }

        User user = UserMapper.fromUserRegisterToUser(userRegisterRequest);

        // nastavit password hash
        userService.save(user);

        return UserMapper.toResponse(user);
    }
}
