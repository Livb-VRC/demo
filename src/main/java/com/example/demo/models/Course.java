package com.example.demo.models;

import com.example.demo.repository.AbstractBaseRepository;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "COURSE")
public class Course extends AbstractBaseEntity {

    @Column(name = "NAME")
    String name;

    @Column(name = "DESCRIPTION")
    String description;

//    @OneToMany
//    @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
//    List<Student> students;
}
