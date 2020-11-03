package com.example.demo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name = "ID")
    long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "RATING")
    String rating;

    @ManyToOne
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
    Course course;
}
