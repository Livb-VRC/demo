package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class MyEntityService<T> implements IMyEntityService<T>{

    private CrudRepository<T, Long> repository;

    public Iterable<T> findAll() {
        return this.repository.findAll();
    }

    public void setRepository(CrudRepository<T, Long> repository) {
        this.repository = repository;
    }

    @Override
    public T findById(Long id) {
        return this.repository.findById(id).get();
    }
}
