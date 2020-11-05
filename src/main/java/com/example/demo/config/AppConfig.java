package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Autowired
    ApplicationContext context;

//    @Bean
//    public IMyEntityService<Item> getItemService() {
//        return new MyEntityService<Item>();
//    }
//
//    @Bean
//    public IMyEntityService<Course> getCourseService() { return new MyEntityService<Course>(); }
//
//    @Bean
//    public IMyEntityService<Student> getStudentService() { return new MyEntityService<Student>(); }


}
