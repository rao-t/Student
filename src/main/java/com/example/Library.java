package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Library {
    private Student student;

    // Constructor Injection
    public Library(Student student) {
        this.student = student;
    }

    // Setter Injection
    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void issueBook() {
        System.out.println("Issuing book for student: " + "Id: " + student.getId() +", Name: "+ student.getName());
    }
}