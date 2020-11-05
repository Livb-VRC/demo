package com.example.demo.controllers;

import com.example.demo.models.AbstractBaseEntity;
import com.example.demo.repository.AbstractBaseRepository;
import com.example.demo.services.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.PostConstruct;
import java.util.List;

public abstract class AbstractBaseController<T extends AbstractBaseEntity> {

    @Autowired
    AbstractBaseService<T> service;

    @GetMapping("")
    public ResponseEntity<List<T>> findAll(){
        return new ResponseEntity<List<T>>(this.service.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<T> findById(@PathVariable Long id){
        return new ResponseEntity<T>(this.service.findById(id), HttpStatus.OK);
    }
}
