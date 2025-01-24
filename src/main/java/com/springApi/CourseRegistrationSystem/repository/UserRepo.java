package com.springApi.CourseRegistrationSystem.repository;

import com.springApi.CourseRegistrationSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByName(String username);
}
