package com.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class Config {
    
    @Bean
    public Student studentBean() {
        return new Student(1,"Laya");
    }

    @Bean
       public Library library() {
        return new Library(studentBean());
    }
}