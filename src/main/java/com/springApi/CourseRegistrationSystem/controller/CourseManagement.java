package com.springApi.CourseRegistrationSystem.controller;

import com.springApi.CourseRegistrationSystem.model.Course;
import com.springApi.CourseRegistrationSystem.service.CourseManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseManagement {
    @Autowired
    CourseManagementService service;
    @PostMapping("/addCourse")
    public Course createCourse(@RequestBody Course course) {
        return service.addCourse(course);
    }

    @GetMapping("/allCourse")
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }

    @GetMapping("/course/{id}")
    public Optional<Course> getCourseById(@PathVariable Long id) {
        return service.getCourseById(id);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course courseDetails) {
        return service.updateCourse(id, courseDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        service.deleteCourse(id);
    }

    @PatchMapping("/{id}")
    public Course partialUpdateCourse(@PathVariable Long id, @RequestBody Course courseDetails) {
        return service.partialUpdateCourse(id, courseDetails);
    }

}
