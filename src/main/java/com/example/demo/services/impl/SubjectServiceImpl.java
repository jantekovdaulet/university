package com.example.demo.services.impl;

import com.example.demo.entities.Course;
import com.example.demo.entities.Subject;
import com.example.demo.repositories.SubjectRepository;
import com.example.demo.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public Subject getSubject(Long id) {
        return subjectRepository.getOne(id);
    }

    @Override
    public List<Subject> getAllSubject() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject addSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public List<Subject> getSubjectsByCourses(List<Course> courses) {
        List<Subject> subjects = new ArrayList<>();
        for (Course course : courses) {
            subjects.add(course.getSubject());
        }
        return subjects;
    }
}
