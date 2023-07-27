package com.example.javaexercise.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class StudentInfoId implements Serializable {
    private Integer infoId;
    private Integer student;
}
