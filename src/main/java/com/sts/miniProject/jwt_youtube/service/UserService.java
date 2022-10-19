package com.sts.miniProject.jwt_youtube.service;

import com.sts.miniProject.jwt_youtube.dao.RoleRepository;
import com.sts.miniProject.jwt_youtube.dao.UserRepository;
import com.sts.miniProject.jwt_youtube.entity.Role;
import com.sts.miniProject.jwt_youtube.entity.User;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
//second for init()
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerNewUser(User user){
        Role role = roleRepository.findById("User").get();

        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRole(roles);

        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
        return repo.save(user);
    }

    public void initRolesAndUsers(){
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin Role");
        roleRepository.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default Role for newly created User");
        roleRepository.save(userRole);


        User adminUser = new User();
        adminUser.setUserFirstName("Leila");
        adminUser.setUserLastName("Niang");
        adminUser.setUserName("leilish");
        adminUser.setUserPassword(getEncodedPassword("leila358"));
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        repo.save(adminUser);


//        User user = new User();
//        user.setUserFirstName("Fatou");
//        user.setUserLastName("Diagne");
//        user.setUserName("Fatima");
//        user.setUserPassword(getEncodedPassword("fatima060"));
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        user.setRole(userRoles);
//        repo.save(user);

    }

    public String getEncodedPassword(String password){
        return passwordEncoder.encode(password);
    }
}
