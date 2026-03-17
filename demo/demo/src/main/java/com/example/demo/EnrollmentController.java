package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class EnrollmentController {

    
    private List<Enrollment> enrollments = new ArrayList<>();

    public EnrollmentController() {
    
        enrollments.add(new Enrollment());
        enrollments.add(new Enrollment());
        enrollments.add(new Enrollment());
    }
    
    @GetMapping("/enrollment/{id}")
    public Enrollment getEnrollmentById(@PathVariable int id) {
        for (Enrollment e : enrollments) {
            if (e.getStudentId() == id) {
                return e;
            }
        }
        return null;
    }

    
    @PostMapping("/enrollment")
    public Enrollment addEnrollment(@RequestBody Enrollment enrollment) {
        enrollments.add(enrollment);
        return enrollment;
    }

    
    @DeleteMapping("/enrollment/{id}")
    public String deleteEnrollment(@PathVariable int id) {

        Iterator<Enrollment> iterator = enrollments.iterator();

        while (iterator.hasNext()) {
            Enrollment e = iterator.next();

            if (e.getStudentId() == id) {
                iterator.remove();
                return "Enrollment deleted successfully";
            }
        }

        return "Enrollment not found";
    }
}