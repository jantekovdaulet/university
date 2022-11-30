package com.example.demo.repositories;

import com.example.demo.entities.Group;
import com.example.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface GroupRepository extends JpaRepository<Group, Long> {

    List<Group> findGroupsByCurator_Id(Long curatorId);

}
