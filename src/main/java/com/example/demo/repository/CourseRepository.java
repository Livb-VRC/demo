package com.example.demo.repository;

import com.example.demo.abstracts.AbstractBaseRepository;
import com.example.demo.models.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends AbstractBaseRepository<Course> {
}