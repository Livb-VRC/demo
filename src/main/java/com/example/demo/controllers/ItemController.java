package com.example.demo.controllers;

import com.example.demo.models.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController extends MyEntityController<Course>{

}
