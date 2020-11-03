package com.example.demo.repository;

import com.example.demo.models.Course;
import com.example.demo.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIStudentRepository extends CrudRepository<Student,Long> {
}
