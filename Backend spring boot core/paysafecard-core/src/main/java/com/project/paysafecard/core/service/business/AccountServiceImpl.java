package com.project.paysafecard.core.service.business;

import com.project.paysafecard.core.model.DTO.request.UserLoginRequest;
import com.project.paysafecard.core.model.DTO.request.UserRegisterRequest;
import com.project.paysafecard.core.model.DTO.response.UserResponse;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.service.jpa.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
            return new UserResponse(user.getFirstName(), user.getLastName(), user.getEmail(), user.getBalance(), user.getDateOfBirth());
        }

        //throw an exception that user had wrong credemtials
        return null;
    }

    //TODO:LOGGERS
    @Override
    public UserResponse register(UserRegisterRequest userRegisterRequest) {
        Optional<User> optionalUser = userService.findUserByEmail(userRegisterRequest.email());

        if (optionalUser.isPresent()) {
            //throw an excpetion that user exists
        }

        User user = new User();

        user.setFirstName(userRegisterRequest.firstName());
        user.setLastName(userRegisterRequest.lastName());
        user.setEmail(userRegisterRequest.email());
        user.setDateOfBirth(userRegisterRequest.dateOfBirth());
        //need to encrypt
        user.setPasswordHash(userRegisterRequest.password());

        userService.save(user);

        return new UserResponse(user.getFirstName(), user.getLastName(), user.getEmail(), user.getBalance(), user.getDateOfBirth());
    }
}
