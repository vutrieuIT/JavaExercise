package com.example.javaexercise.service;

import com.example.javaexercise.entity.User;

public interface UserService {

    User login(User user);

    User register(User user);
}
