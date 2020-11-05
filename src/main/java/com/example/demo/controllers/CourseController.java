package com.example.demo.controllers;

import com.example.demo.models.Course;
import com.example.demo.models.Item;
import com.example.demo.repository.AbstractBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController extends AbstractBaseController<Course>{

}
