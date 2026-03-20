package com.demo.studentapp.Repository; 
 
import com.demo.studentapp.model.Student; 
import org.springframework.data.jpa.repository.JpaRepository; 
 
public interface StudentRepository extends JpaRepository<Student, Integer> { 
}