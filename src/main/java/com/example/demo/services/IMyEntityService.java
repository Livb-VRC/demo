package com.example.demo.services;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface IMyEntityService<T> {

    public Iterable<T> findAll();

    public void setRepository(CrudRepository<T, Long> repository);

    public T findById(Long id);

}
