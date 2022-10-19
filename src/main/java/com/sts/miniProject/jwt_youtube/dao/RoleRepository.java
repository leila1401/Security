package com.sts.miniProject.jwt_youtube.dao;

import com.sts.miniProject.jwt_youtube.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role , String> {
}
