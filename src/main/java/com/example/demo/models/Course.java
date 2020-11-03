package com.example.demo.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "COURSE")
public class Course {

    @Id
    @Column(name = "ID")
    long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "DESCRIPTION")
    String description;
}
