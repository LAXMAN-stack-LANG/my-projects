package com.example.demo;

public class Course {
    private String course;
    public Course(){
    }
    public String getCourse() {
        return course;
    }
    public Course(String course)
    {
        this.course = course;

    }
    public void setCourse(String course) {
        this.course = course;
    }
    public int getId() {
    
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}