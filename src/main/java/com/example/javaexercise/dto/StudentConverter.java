package com.example.javaexercise.dto;

import com.example.javaexercise.entity.Student;
import com.example.javaexercise.entity.StudentInfo;

public class StudentConverter {

    public static void fromDTO(StudentDTO studentDTO, Student student, StudentInfo studentInfo){
        student.setStudentId(studentDTO.getStudentId());
        student.setStudentName(studentDTO.getStudentName());
        student.setStudentCode(studentDTO.getStudentCode());

        studentInfo.setInfoId(studentDTO.getStudentInfoId());
        studentInfo.setAddress(studentDTO.getAddress());
        studentInfo.setAverageScore(studentDTO.getAverageScore());
        studentInfo.setDateOfBirth(studentDTO.getDateOfBirth());
    }

    public static void toDTO(StudentDTO studentDTO, Student student, StudentInfo studentInfo){
        studentDTO.setStudentId(student.getStudentId());
        studentDTO.setStudentName(student.getStudentName());
        studentDTO.setStudentCode(student.getStudentCode());

        studentDTO.setStudentInfoId(studentInfo.getInfoId());
        studentDTO.setAddress(studentInfo.getAddress());
        studentDTO.setAverageScore(studentInfo.getAverageScore());
        studentDTO.setDateOfBirth(studentInfo.getDateOfBirth());
    }
}
