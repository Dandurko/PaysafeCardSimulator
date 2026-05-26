package com.project.paysafecard.core.service.jpaService;

import com.project.paysafecard.core.model.entity.User;
import com.project.paysafecard.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
