package com.project.paysafecard.core.service.jpa;

import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return Optional.of(userRepository.findUserByEmail(email));
    }
}
