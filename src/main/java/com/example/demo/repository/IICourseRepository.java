package com.example.demo.repository;

import com.example.demo.models.Course;
import com.example.demo.models.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IICourseRepository extends CrudRepository<Course,Long> {
}
