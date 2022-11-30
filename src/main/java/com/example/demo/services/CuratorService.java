package com.example.demo.services;

import com.example.demo.entities.City;
import com.example.demo.entities.Curator;

import java.util.List;

public interface CuratorService {

    Curator getCurator(Long id);
    List<Curator> getAllCurator();
    Curator addCurator(Curator curator);
    Curator saveCurator(Curator curator);
    void deleteCurator(Long id);

}

