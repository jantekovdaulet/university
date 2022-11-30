package com.example.demo.services;

import com.example.demo.entities.City;
import com.example.demo.entities.Group;

import java.util.List;

public interface GroupService {

    Group getGroup(Long id);
    List<Group> getAllGroups();
    Group addGroup(Group group);
    Group saveGroup(Group group);
    void deleteGroup(Long id);
    List<Group> getGroupsByCuratorId(Long curatorId);

}

