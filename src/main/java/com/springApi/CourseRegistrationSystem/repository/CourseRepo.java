package com.springApi.CourseRegistrationSystem.repository;

import com.springApi.CourseRegistrationSystem.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Long> {

}