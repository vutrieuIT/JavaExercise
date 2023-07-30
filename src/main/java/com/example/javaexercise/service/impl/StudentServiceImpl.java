package com.example.javaexercise.service.impl;

import com.example.javaexercise.dto.StudentConverter;
import com.example.javaexercise.dto.StudentDTO;
import com.example.javaexercise.entity.Student;
import com.example.javaexercise.entity.StudentInfo;
import com.example.javaexercise.repository.StudentInfoRepository;
import com.example.javaexercise.repository.StudentRepository;
import com.example.javaexercise.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    private final StudentInfoRepository studentInfoRepository;

    @Override
    public ResponseEntity<StudentDTO> save(StudentDTO studentDTO) {
        Student student = new Student();
        StudentInfo studentInfo =new StudentInfo();
        StudentConverter.fromDTO(studentDTO,student,studentInfo);
        Student existStudent = studentRepository.findByStudentCode(student.getStudentCode()).orElse(null);
        if (existStudent == null ||
                (studentDTO.getStudentId() != null && existStudent != null)){
            Student student1 = studentRepository.save(student);
            studentInfo.setStudent(student1);
            StudentInfo studentInfo1 = studentInfoRepository.save(studentInfo);

            StudentDTO studentDTO1 = new StudentDTO();
            StudentConverter.toDTO(studentDTO1,student1,studentInfo1);
            return ResponseEntity.ok(studentDTO1);
        }
        return ResponseEntity.ok(new StudentDTO());
    }

    @Override
    public List<StudentDTO> getAll() {
        return studentInfoRepository.findAllStudentDTO();
    }

    @Override
    @Transactional
    public ResponseEntity<String> delete(Integer studentId) {
        try {
            studentInfoRepository.deleteByStudent_StudentId(studentId);
            studentRepository.deleteById(studentId);

            JSONObject response = new JSONObject();
            response.put("success", true);
            response.put("message", "đã xóa");
            return ResponseEntity.ok(response.toJSONString());
        } catch (Exception e){
            JSONObject response = new JSONObject();
            response.put("success", false);
            response.put("message", "đã có lỗi xảy ra, vui lòng liên hệ quản trị viên");
            return ResponseEntity.ok(response.toJSONString());
        }
    }
}
