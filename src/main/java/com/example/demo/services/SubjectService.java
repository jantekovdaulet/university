package com.example.demo.services;

import com.example.demo.entities.Course;
import com.example.demo.entities.Student;
import com.example.demo.entities.Subject;

import java.util.List;

public interface SubjectService {

    Subject getSubject(Long id);
    List<Subject> getAllSubject();
    Subject addSubject(Subject subject);
    Subject saveSubject(Subject subject);
    void deleteSubject(Long id);
    List<Subject> getSubjectsByCourses(List<Course> courses);
}

