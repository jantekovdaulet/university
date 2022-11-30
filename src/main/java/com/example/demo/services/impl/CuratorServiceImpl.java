package com.example.demo.services.impl;

import com.example.demo.entities.Curator;
import com.example.demo.repositories.CuratorRepository;
import com.example.demo.services.CuratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuratorServiceImpl implements CuratorService {

    @Autowired
    private CuratorRepository curatorRepository;

    @Override
    public Curator getCurator(Long id) {
        return curatorRepository.getOne(id);
    }

    @Override
    public List<Curator> getAllCurator() {
        return curatorRepository.findAll();
    }

    @Override
    public Curator addCurator(Curator curator) {
        return curatorRepository.save(curator);
    }

    @Override
    public Curator saveCurator(Curator curator) {
        return curatorRepository.save(curator);
    }

    @Override
    public void deleteCurator(Long id) {
        curatorRepository.deleteById(id);
    }
}
