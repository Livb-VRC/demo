package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Autowired
    ApplicationContext context;

//    @Bean
//    public AbstractBaseService<Course> getCourseService() { return new AbstractBaseService<Course>(); }
//
//    @Bean
//    public AbstractBaseService<Item> getStudentService() { return new AbstractBaseService<Item>(); }



}
