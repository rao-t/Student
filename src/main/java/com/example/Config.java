package com.example;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    
    @Bean
    public Student studentBean() {
        return new Student(2,"Laya");
    }

    @Bean
       public Library library() {
        return new Library(studentBean());
    }

    
}