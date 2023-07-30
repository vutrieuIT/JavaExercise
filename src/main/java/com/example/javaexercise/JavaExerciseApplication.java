package com.example.javaexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;


@CrossOrigin
@SpringBootApplication
public class JavaExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaExerciseApplication.class, args);
    }

}
