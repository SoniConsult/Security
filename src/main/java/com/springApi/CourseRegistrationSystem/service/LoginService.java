package com.springApi.CourseRegistrationSystem.service;

import com.springApi.CourseRegistrationSystem.model.User;
import com.springApi.CourseRegistrationSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UserRepo repo;
    @Autowired
    AuthenticationManager authmanager;
    @Autowired
    private JWTService jwtService;
    public String verify(User user) {
        try {
            Authentication authentication = authmanager.authenticate(
                    new UsernamePasswordAuthenticationToken(user.getName(), user.getPassword())
            );
            if (authentication.isAuthenticated()) {
                return jwtService.generateToken(user.getName());
            }
        } catch (Exception e) {
            return "Login failed: " + e.getMessage();
        }
        return "Failure";
    }
}
