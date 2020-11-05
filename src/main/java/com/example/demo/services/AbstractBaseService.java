package com.example.demo.services;

import com.example.demo.models.AbstractBaseEntity;
import com.example.demo.repository.AbstractBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
