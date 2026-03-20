package com.demo.studentapp.controller; 
 
import com.demo.studentapp.model.Student; 
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List; 
 
@RestController 
public class StudentController { 
    private List<Student> students = new ArrayList<>();

    public StudentController() {
        students.add(new Student(1, "John Doe", "john.doe@example.com"));
        students.add(new Student(2, "Jane Smith", "jane.smith@example.com"));
        students.add(new Student(3, "Alice Johnson", "alice.johnson@example.com"));
        students.add(new Student(4, "Bob Brown", "bob.brown@example.com"));
        students.add(new Student(5, "Charlie Davis", "charlie.davis@example.com"));
        students.add(new Student(6, "Emily Wilson", "emily.wilson@example.com"));
        students.add(new Student(7, "David Lee", "david.lee@example.com")); 
    }

    
   @GetMapping("/all")
   public List<Student> getAllStudents() { 
       return students; 
   } 

   @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
 
   } 