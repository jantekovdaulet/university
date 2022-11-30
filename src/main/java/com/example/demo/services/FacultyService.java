package com.example.demo.services;

import com.example.demo.entities.Faculty;

import java.util.List;

public interface FacultyService {

    Faculty getFaculty(Long id);
    List<Faculty> getAllFaculties();
    Faculty addFaculty(Faculty faculty);
    Faculty saveFaculty(Faculty faculty);
    void deleteFaculty(Long id);

}

