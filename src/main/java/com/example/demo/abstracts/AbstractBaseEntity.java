package com.example.demo.abstracts;

import lombok.Data;

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