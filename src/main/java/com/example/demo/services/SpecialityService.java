package com.example.demo.services;

import com.example.demo.entities.Group;
import com.example.demo.entities.Speciality;

import java.util.List;

public interface SpecialityService {

    Speciality getSpeciality(Long id);
    List<Speciality> getAllSpecialities();
    Speciality addSpeciality(Speciality speciality);
    Speciality saveSpeciality(Speciality speciality);
    void deleteSpeciality(Long id);

}

