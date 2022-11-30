package com.example.demo.services;

import com.example.demo.entities.Speciality;
import com.example.demo.entities.Student;

import java.util.List;

public interface StudentService {

    Student getStudent(Long id);
    List<Student> getAllStudents();
    Student addStudent(Student student);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudentsByGroupId(Long groupId);

}

