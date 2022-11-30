package com.example.demo.services;

import com.example.demo.entities.Subject;
import com.example.demo.entities.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher getTeacher(Long id);
    List<Teacher> getAllTeacher();
    Teacher addTeacher(Teacher teacher);
    Teacher saveTeacher(Teacher teacher);
    void deleteTeacher(Long id);

}

