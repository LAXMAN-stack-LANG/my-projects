package com.example.demo;

public class Enrollment {
    private int id;
    private String course;
    public Enrollment(){
    }
    
    public Enrollment(int id,String course)
    {
        this.id=id;
        this.course = course;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    public int getStudentId() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getStudentId'");
    }
}