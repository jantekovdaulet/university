package com.example.demo.services.impl;

import com.example.demo.entities.Speciality;
import com.example.demo.repositories.SpecialityRepository;
import com.example.demo.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityServiceImpl implements SpecialityService {

    @Autowired
    private SpecialityRepository specialityRepository;

    @Override
    public Speciality getSpeciality(Long id) {
        return specialityRepository.getOne(id);
    }

    @Override
    public List<Speciality> getAllSpecialities() {
        return specialityRepository.findAll();
    }

    @Override
    public Speciality addSpeciality(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public Speciality saveSpeciality(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void deleteSpeciality(Long id) {
        specialityRepository.deleteById(id);
    }
}
