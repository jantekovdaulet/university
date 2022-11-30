package com.example.demo.services.impl;

import com.example.demo.entities.Course;
import com.example.demo.entities.Mark;
import com.example.demo.repositories.MarkRepository;
import com.example.demo.services.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarkServiceImpl implements MarkService {

    @Autowired
    private MarkRepository markRepository;

    @Override
    public Mark getMark(Long id) {
        return markRepository.getOne(id);
    }

    @Override
    public List<Mark> getAllMarks() {
        return markRepository.findAll();
    }

    @Override
    public Mark addMark(Mark mark) {
        return markRepository.save(mark);
    }

    @Override
    public Mark saveMark(Mark mark) {
        return markRepository.save(mark);
    }

    @Override
    public void deleteMark(Long id) {
        markRepository.deleteById(id);
    }

    @Override
    public List<Mark> getMarksByStudentIdAndCourseId(Long studentId, Long courseId) {
        return markRepository.findMarksByStudentIdAndCourseId(studentId, courseId);
    }

    @Override
    public List<Mark> getSumMarksByCourse(List<Course> courses, Long studentId) {
        List<Mark> sumMarksOfCourse = new ArrayList<>();
        for (Course course : courses) {

            Double sum = 0.0;
            List<Mark> marks = getMarksByStudentIdAndCourseId(studentId, course.getId());
            for (Mark mark : marks) {
                sum += mark.getMark();
            }

            Mark sumMark = new Mark();
            sumMark.setCourse(course);
            sumMark.setMark(sum);
            sumMarksOfCourse.add(sumMark);

        }
        return sumMarksOfCourse;
    }

}
