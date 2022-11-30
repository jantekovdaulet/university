package com.example.demo.repositories;

import com.example.demo.entities.Course;
import com.example.demo.entities.Group;
import com.example.demo.entities.Student;
import groovy.transform.Trait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentsByGroupId(Long groupId);

}
