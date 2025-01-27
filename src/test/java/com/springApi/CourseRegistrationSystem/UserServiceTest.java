package com.springApi.CourseRegistrationSystem;


import com.springApi.CourseRegistrationSystem.model.Course;
import com.springApi.CourseRegistrationSystem.model.User;
import com.springApi.CourseRegistrationSystem.repository.CourseRepo;
import com.springApi.CourseRegistrationSystem.repository.UserRepo;
import com.springApi.CourseRegistrationSystem.service.CourseManagementService;
import com.springApi.CourseRegistrationSystem.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;
//@Test

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserRepo userRepo;
    @Mock
    private CourseRepo courseRepo;
    @InjectMocks
    private UserService userService;
    private User user;
    @InjectMocks
    private CourseManagementService courseService;
    private Course course;
    @BeforeEach
    public void setup(){
       user = new User();
       user.setId(101);
       user.setName("Soni");
       user.setPassword("soni");
       user.setEmail("soni");
    }

    @Test
    public void RegistrationTest(){
        when(userRepo.findByName(user.getEmail()))
                .thenReturn(user);

        when(userRepo.save(user)).thenReturn(user);

        User savedUser = userService.addUser(user);

        System.out.println(savedUser);

        assertThat(savedUser).isNotNull();
    }


    @Test
    public void GetAllCourses(){
        Course course1 = new Course();
        course1.setId(112);
        course1.setTitle("Java");
        course1.setDescription("abc");
        course1.setPrice(567);
        Course course2 = new Course();
        course1.setId(112);
        course1.setTitle("Java");
        course1.setDescription("abc");
        course1.setPrice(567);


        when(courseRepo.findAll()).thenReturn(List.of(course2,course1));
        List<Course> employeeList = courseService.getAllCourses();
        assertThat(employeeList).isNotNull();
        assertThat(employeeList.size()).isEqualTo(2);
    }


    @Test
    public void UpdateCourse(){

        when(courseRepo.save(course)).thenReturn(course);
        long courseId=course.getId();
        course.setTitle("Python");
        course.setDescription("Learning python");


       Course updatedCourse = courseService.updateCourse(courseId,course);

        assertThat(updatedCourse.getTitle()).isEqualTo("Python");
        assertThat(updatedCourse.getDescription()).isEqualTo("Learning python");
    }

}

