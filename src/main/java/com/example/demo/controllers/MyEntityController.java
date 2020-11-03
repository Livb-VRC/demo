package com.example.demo.controllers;

import com.example.demo.models.Item;
import com.example.demo.services.MyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class MyEntityController<T_Entity> {

    @Autowired
    MyEntityService<T_Entity> service;

    @GetMapping("")
    public ResponseEntity<List<T_Entity>> findAll(){
        return new ResponseEntity<List<T_Entity>>(this.service.findAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<T_Entity> findById(@PathVariable Long id){
        return new ResponseEntity<T_Entity>(this.service.findById(id), HttpStatus.OK);
    }
}
