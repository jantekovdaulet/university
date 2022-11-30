package com.example.demo.services.impl;

import com.example.demo.entities.Day;
import com.example.demo.repositories.DayRepository;
import com.example.demo.services.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DayServiceImpl implements DayService {

    @Autowired
    private DayRepository dayRepository;

    @Override
    public Day getDay(Long id) {
        return dayRepository.getOne(id);
    }

    @Override
    public List<Day> getAllDays() {
        return dayRepository.findAll();
    }

    @Override
    public Day addDay(Day day) {
        return dayRepository.save(day);
    }

    @Override
    public Day saveDay(Day day) {
        return dayRepository.save(day);
    }

    @Override
    public void deleteDay(Long id) {

    }
}
