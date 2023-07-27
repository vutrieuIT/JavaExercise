package com.example.javaexercise.repository;

import com.example.javaexercise.entity.StudentInfo;
import com.example.javaexercise.entity.StudentInfoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentInfoRepository extends JpaRepository<StudentInfo, StudentInfoId> {

    @Query("select si from StudentInfo si where si.infoId = :infoId and si.student.studentId =:student")
    StudentInfo findByInfoIdAndStudent(Integer infoId, Integer student);
}
