package com.example.demo.services;

import com.example.demo.entities.Course;
import com.example.demo.entities.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface CourseService{

    Course getCourse(Long id);
    List<Course> getAllCourses();
    Course addCourse(Course course);
    Course saveCourse(Course course);
    void deleteCourse(Long id);

}

