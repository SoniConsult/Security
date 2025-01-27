package com.springApi.CourseRegistrationSystem.controller;


import com.springApi.CourseRegistrationSystem.model.User;
import com.springApi.CourseRegistrationSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class RegistrationController {
    @Autowired
    UserService service;
    @PostMapping("/register")
    public  User registerUser(@RequestBody User user){
       return service.addUser(user);
    }
}
