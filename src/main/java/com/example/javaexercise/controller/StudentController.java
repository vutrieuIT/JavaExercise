package com.example.javaexercise.controller;

import com.example.javaexercise.dto.StudentDTO;
import com.example.javaexercise.service.StudentService;
import jakarta.persistence.Column;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<StudentDTO> save(@RequestBody StudentDTO studentDTO){
        return studentService.save(studentDTO);
    }
    @GetMapping()
    public List<StudentDTO> getAll(){
        return studentService.getAll();
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> delete(@PathVariable Integer studentId) {
        return studentService.delete(studentId);
    }
}
