package com.example.javaexercise.repository;

import com.example.javaexercise.dto.StudentDTO;
import com.example.javaexercise.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findByStudentCode(String studentCode);



}
