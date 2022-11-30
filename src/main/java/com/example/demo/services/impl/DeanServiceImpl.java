package com.example.demo.services.impl;

import com.example.demo.entities.Dean;
import com.example.demo.repositories.DeanRepository;
import com.example.demo.services.DeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeanServiceImpl implements DeanService {

    @Autowired
    private DeanRepository deanRepository;

    @Override
    public Dean getDean(Long id) {
        return deanRepository.getOne(id);
    }

    @Override
    public List<Dean> getAllDeans() {
        return deanRepository.findAll();
    }

    @Override
    public Dean addDean(Dean dean) {
        return deanRepository.save(dean);
    }

    @Override
    public Dean saveDean(Dean dean) {
        return deanRepository.save(dean);
    }

    @Override
    public void deleteDean(Long id) {
        deanRepository.deleteById(id);
    }
}
