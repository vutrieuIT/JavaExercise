package com.example.javaexercise.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_info")
public class StudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer infoId;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private String address;

    private Double averageScore;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date dateOfBirth;
}
