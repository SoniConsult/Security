package com.springApi.CourseRegistrationSystem.service;

import com.springApi.CourseRegistrationSystem.model.User;
import com.springApi.CourseRegistrationSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
    UserRepo repo;

   private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
   public User addUser(User user){
       user.setPassword(encoder.encode(user.getPassword()));
       System.out.println((String)user.getPassword());
       System.out.println((String)user.getName());
       repo.save(user);
       return user;
   }
}
