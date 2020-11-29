package com.example.demo.abstracts;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public abstract class AbstractBaseService<T extends AbstractBaseEntity> {

    @Autowired
    AbstractBaseRepository<T> repository;

    public List<T> findAll() {
        return this.repository.findAll();
    }

    public T findById(Long id) {
        return this.repository.findById(id).get();
    }
}
