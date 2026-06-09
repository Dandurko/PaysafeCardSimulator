package com.project.paysafecard.core.controller;

import com.project.paysafecard.core.mapper.UserMapper;
import com.project.paysafecard.core.model.DTO.request.UserLoginRequest;
import com.project.paysafecard.core.model.DTO.request.UserRegisterRequest;
import com.project.paysafecard.core.model.DTO.response.UserResponse;
import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.security.JwtUtil;
import com.project.paysafecard.core.service.business.AccountService;
import com.project.paysafecard.core.service.jpa.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class UserController {

    @Autowired
    AccountService accountService;

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/login")
    public UserResponse login(@Valid @RequestBody UserLoginRequest userLoginRequest, HttpServletResponse response) {

        // this checks if user got correct credentials
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                userLoginRequest.email(), userLoginRequest.password()
        ));

        // TODO: check if we can remove this duplicate search
        User user = userService.findUserByEmail(userLoginRequest.email())
                .orElseThrow(() -> new RuntimeException("User not found"));

        generateJwtAndSetToCookie(response, user.getEmail());

        return UserMapper.toResponse(user);

    }

    @PostMapping("/register")
    public UserResponse register(@Valid @RequestBody UserRegisterRequest userRegisterRequest, HttpServletResponse response) {

        UserResponse userResponse = accountService.register(userRegisterRequest);

        generateJwtAndSetToCookie(response, userResponse.email());

        return userResponse;

    }

    private void generateJwtAndSetToCookie(HttpServletResponse response, String email) {
        String token = jwtUtil.generateToken(email);

        Cookie cookie = new Cookie("jwtToken", token);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

}
