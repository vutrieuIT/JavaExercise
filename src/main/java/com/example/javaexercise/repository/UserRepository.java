package com.example.javaexercise.repository;

import com.example.javaexercise.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserNameAndPassword(String userName, String password);
    Optional<User> findByUserName(String userName);
}
