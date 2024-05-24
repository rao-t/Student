package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Laboratory {
    private Student student;

    // setter injection
    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStudent() {
        return student.getName();
    }

    @Override
    public String toString() {
        return  "\nId = "+ String.valueOf(this.student.getId()) + "\nName = "+ this.getStudent() ;
    }
    
}
