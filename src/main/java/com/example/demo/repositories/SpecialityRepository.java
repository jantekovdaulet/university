package com.example.demo.repositories;

import com.example.demo.entities.Speciality;
import com.example.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface SpecialityRepository extends JpaRepository<Speciality, Long> {
}
