package com.example.demo.models;

import com.example.demo.abstracts.AbstractBaseEntity;
import lombok.Data;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;

@Entity
@Data
@Subselect("SELECT * FROM course WHERE DELETED = 0")
public class Course extends AbstractBaseEntity {

    @Column(name = "NAME")
    String name;

    @Column(name = "DESCRIPTION")
    String description;

//    @OneToMany
//    @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
//    List<Student> students;
}
