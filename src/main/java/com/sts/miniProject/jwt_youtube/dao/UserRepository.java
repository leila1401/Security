package com.sts.miniProject.jwt_youtube.dao;

import com.sts.miniProject.jwt_youtube.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
