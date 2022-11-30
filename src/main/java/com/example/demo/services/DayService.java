package com.example.demo.services;

import com.example.demo.entities.Day;

import java.util.List;

public interface DayService {

    Day getDay(Long id);
    List<Day> getAllDays();
    Day addDay(Day date);
    Day saveDay(Day date);
    void deleteDay(Long id);
//    List<Mark> getMarksByStudentIdAndCourseId(Long studentId, Long courseId);
//    List<Mark> getSumMarksByCourse(List<Course> courses, Long studentId);
}
