package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class MyEntityService<T_Entity> {

    @Autowired
    JpaRepository<T_Entity, Long> repository;

    public List<T_Entity> findAll() {
        return this.repository.findAll();
    }

    public T_Entity findById(Long id) throws EntityNotFoundException{
        return this.repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Entity with id " + id + "not found"));
    }


}
