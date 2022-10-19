package com.sts.miniProject.jwt_youtube.controller;

import com.sts.miniProject.jwt_youtube.dao.UserRepository;
import com.sts.miniProject.jwt_youtube.entity.JwtRequest;
import com.sts.miniProject.jwt_youtube.entity.JwtResponse;
import com.sts.miniProject.jwt_youtube.entity.User;
import com.sts.miniProject.jwt_youtube.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin
public class JwtController {

    @Autowired
    private JwtService jwtService;


    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
      return  jwtService.createJwtToken(jwtRequest);
    }
}
