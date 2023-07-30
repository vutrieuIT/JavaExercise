package com.example.javaexercise.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public interface IStudentDTO {
    Integer getStudentId();
    String getStudentName();
    String getStudentCode();
    String getAddress();
    Double getAverageScore();
    Date getDateOfBirth();
}
