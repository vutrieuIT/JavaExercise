package com.example.javaexercise.service;

import com.example.javaexercise.dto.StudentDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

    ResponseEntity<StudentDTO> save(StudentDTO studentDTO);

    List<StudentDTO> getAll();

    ResponseEntity<String> delete(Integer studentId);
}
