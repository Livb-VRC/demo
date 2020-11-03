package com.example.demo.controllers;

import com.example.demo.models.Course;
import com.example.demo.models.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController extends MyEntityController<Course>{

}
