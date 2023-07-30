package com.example.javaexercise;

import com.example.javaexercise.dto.StudentDTO;
import com.example.javaexercise.entity.StudentInfo;
import com.example.javaexercise.repository.StudentInfoRepository;
import com.example.javaexercise.repository.StudentRepository;
import com.example.javaexercise.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@SpringBootTest
class JavaExerciseApplicationTests {

    @Autowired
    StudentService studentService;
    @Autowired
    StudentInfoRepository studentInfoRepository;
    @Test
    @Transactional
    @Rollback(false)
    void contextLoads() {
        studentInfoRepository.deleteByStudent_StudentId(1);
    }

}
