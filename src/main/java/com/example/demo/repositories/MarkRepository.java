package com.example.demo.repositories;

import com.example.demo.entities.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface MarkRepository extends JpaRepository<Mark, Long> {

    List<Mark> findMarksByStudentIdAndCourseId(Long studentId, Long courseId);

}
