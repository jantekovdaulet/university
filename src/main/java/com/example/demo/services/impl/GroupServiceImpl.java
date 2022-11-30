package com.example.demo.services.impl;

import com.example.demo.entities.Group;
import com.example.demo.repositories.GroupRepository;
import com.example.demo.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group getGroup(Long id) {
        return groupRepository.getOne(id);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Group addGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group saveGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }

    @Override
    public List<Group> getGroupsByCuratorId(Long curatorId) {
        return groupRepository.findGroupsByCurator_Id(curatorId);
    }
}
