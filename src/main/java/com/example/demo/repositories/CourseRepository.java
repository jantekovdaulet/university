package com.example.demo.repositories;

import com.example.demo.entities.Course;
import com.example.demo.entities.Student;
import com.example.demo.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course, Long> {
}

