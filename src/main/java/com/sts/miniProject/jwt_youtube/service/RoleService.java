package com.sts.miniProject.jwt_youtube.service;

import com.sts.miniProject.jwt_youtube.dao.RoleRepository;
import com.sts.miniProject.jwt_youtube.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository repo;
    public Role createNewRole(Role role){
        return repo.save(role);
    }
}
