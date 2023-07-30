package com.example.javaexercise.service.impl;

import com.example.javaexercise.entity.User;
import com.example.javaexercise.repository.UserRepository;
import com.example.javaexercise.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;
    @Override
    public User login(User user) {
        if (!validateUser(user)){
            return new User();
        }
        User existUser = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword())
                .orElse(new User());
        return existUser;
    }

    @Override
    public User register(User user) {
        if (!validateUser(user)){
            return new User();
        }
        User existUser = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword())
                .orElse(null);
        if (existUser != null){
            return new User();
        } else {
            return userRepository.save(user);
        }

    }

    private boolean validateUser(User user){
        if (user.getUserName().length() > 20
                || user.getPassword().length() < 6
                || user.getPassword().length() > 15){
            return false;
        }
        return true;
    }
}
