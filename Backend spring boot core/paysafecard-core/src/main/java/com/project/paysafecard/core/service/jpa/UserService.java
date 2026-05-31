package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.User;

import java.util.Optional;

public interface UserService {

    void save(User user);

    Optional<User> findUserByEmail(String email);
}
