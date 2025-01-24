package com.springApi.CourseRegistrationSystem.controller;

import com.springApi.CourseRegistrationSystem.model.Login;
import com.springApi.CourseRegistrationSystem.model.User;
import com.springApi.CourseRegistrationSystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
    @Autowired
    LoginService service;

    @PostMapping("/login")
    public String loginUser(@RequestBody User userlogin){
        return service.verify(userlogin);
    }
}


