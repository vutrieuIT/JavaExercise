package com.example.javaexercise.controller;

import com.example.javaexercise.entity.User;
import com.example.javaexercise.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private final UserService userService;
    @PostMapping("/login")
    public User login(@RequestBody User user){
        return userService.login(user);
    }

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }
}
