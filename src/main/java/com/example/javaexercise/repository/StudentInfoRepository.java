package com.example.javaexercise.repository;

import com.example.javaexercise.dto.StudentDTO;
import com.example.javaexercise.entity.Student;
import com.example.javaexercise.entity.StudentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentInfoRepository extends JpaRepository<StudentInfo, Integer> {

    @Query("select si from StudentInfo si where si.infoId = :infoId and si.student.studentId =:student")
    StudentInfo findByInfoIdAndStudent(Integer infoId, Integer student);

    @Query("SELECT NEW com.example.javaexercise.dto.StudentDTO(s.studentId, s.studentName, " +
            "s.studentCode, si.infoId , si.address, si.averageScore, si.dateOfBirth) " +
            "FROM StudentInfo si JOIN si.student s ORDER BY s.studentId ASC")
    List<StudentDTO> findAllStudentDTO();

//    @Query("delete from StudentInfo si where si.student.studentId = :studentId")
    void deleteByStudent_StudentId(Integer studentId);
}