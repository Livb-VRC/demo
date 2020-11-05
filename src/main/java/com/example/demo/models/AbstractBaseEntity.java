package com.example.demo.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
public class AbstractBaseEntity implements Serializable {

    @Id
    private long id;

    Boolean deleted;

}