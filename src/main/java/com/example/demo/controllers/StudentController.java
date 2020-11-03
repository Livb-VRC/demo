package com.example.demo.controllers;

import com.example.demo.models.Course;
import com.example.demo.models.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController extends MyEntityController<Student> {
}
