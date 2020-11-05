package com.example.demo.config;

import com.example.demo.models.Course;
import com.example.demo.models.Item;
import com.example.demo.repository.AbstractBaseRepository;
import com.example.demo.services.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
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
