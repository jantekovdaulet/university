package com.example.demo.services;

import com.example.demo.entities.City;
import com.example.demo.entities.Dean;

import java.util.List;

public interface DeanService {

    Dean getDean(Long id);
    List<Dean> getAllDeans();
    Dean addDean(Dean dean);
    Dean saveDean(Dean dean);
    void deleteDean(Long id);

}

