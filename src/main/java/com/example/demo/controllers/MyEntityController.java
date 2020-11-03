package com.example.demo.controllers;

import com.example.demo.services.IMyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;

public abstract class MyEntityController<T> {
    @Autowired
    IMyEntityService<T> service;

    @Autowired
    CrudRepository<T, Long> repository;

    // For some reason autowired crudrepo does not work if I put it in MyEntityService so I have to set it here
    @PostConstruct
    public void init(){
        this.service.setRepository(repository);
    }

    @GetMapping("")
    public ResponseEntity<Iterable<T>> findAll(){
        return new ResponseEntity<Iterable<T>>(this.service.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<T> findById(@PathVariable Long id){
        return new ResponseEntity<T>(this.repository.findById(id).get(), HttpStatus.OK);
    }
}
