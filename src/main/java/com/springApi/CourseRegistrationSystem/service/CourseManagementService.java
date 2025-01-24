package com.springApi.CourseRegistrationSystem.service;

import com.springApi.CourseRegistrationSystem.model.Course;
import com.springApi.CourseRegistrationSystem.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourseManagementService {

    @Autowired
    CourseRepo courseRepo;
    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Optional<Course> getCourseById(Long id) {
        System.out.println(id);
        return courseRepo.findById(id);
    }

    public Course updateCourse(Long id, Course courseDetails) {
        Course course = courseRepo.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
        course.setTitle(courseDetails.getTitle());
        course.setDescription(courseDetails.getDescription());
        course.setPrice(courseDetails.getPrice());
        return courseRepo.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepo.deleteById(id);
    }

    public Course partialUpdateCourse(Long id, Course courseDetails) {
        Course course = courseRepo.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));

        if (courseDetails.getTitle() != null) {
            course.setTitle(courseDetails.getTitle());
        }
        if (courseDetails.getDescription() != null) {
            course.setDescription(courseDetails.getDescription());
        }
        if (courseDetails.getPrice() != 0) {
            course.setPrice(courseDetails.getPrice());
        }

        return courseRepo.save(course);
    }
}
