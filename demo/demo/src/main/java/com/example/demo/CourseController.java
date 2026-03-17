package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class CourseController {

    
    private List<Course> courses = new ArrayList<>();

    public CourseController() {
    
        courses.add(new Course());
        courses.add(new Course());
        courses.add(new Course());
    }

    
    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable int id) {
        for (Course c : courses) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    
    @PostMapping("/course")
    public Course addCourse(@RequestBody Course course) {
        courses.add(course);
        return course;
    }

    
    @DeleteMapping("/course/{id}")
    public String deleteCourse(@PathVariable int id) {

        Iterator<Course> iterator = courses.iterator();

        while (iterator.hasNext()) {
            Course c = iterator.next();

            if (c.getId() == id) {
                iterator.remove();
                return "Course deleted successfully";
            }
        }

        return "Course not found";
    }
}