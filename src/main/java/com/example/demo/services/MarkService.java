package com.example.demo.services;

import com.example.demo.entities.Course;
import com.example.demo.entities.Group;
import com.example.demo.entities.Mark;

import java.util.List;

public interface MarkService {

    Mark getMark(Long id);
    List<Mark> getAllMarks();
    Mark addMark(Mark mark);
    Mark saveMark(Mark mark);
    void deleteMark(Long id);
    List<Mark> getMarksByStudentIdAndCourseId(Long studentId, Long courseId);
    List<Mark> getSumMarksByCourse(List<Course> courses, Long studentId);
}
