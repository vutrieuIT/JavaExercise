package com.example.javaexercise.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private Integer studentId;

    private String studentName;

    private String studentCode;

    private Integer studentInfoId;

    private String address;

    private Double averageScore;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date dateOfBirth;
}
