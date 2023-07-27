package com.example.javaexercise;

import com.example.javaexercise.entity.StudentInfo;
import com.example.javaexercise.repository.StudentInfoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaExerciseApplicationTests {

    @Autowired
    StudentInfoRepository repository;
    @Test
    void contextLoads() {
        System.out.println(repository.findByInfoIdAndStudent(1,1));
    }

}
