package com.example.demo.controllers;

import com.example.demo.models.Course;
import com.example.demo.models.Item;
import com.example.demo.repository.IICourseRepository;
import com.example.demo.repository.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController extends MyEntityController<Course> {
}
