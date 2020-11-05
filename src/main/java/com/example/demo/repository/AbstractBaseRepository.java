package com.example.demo.repository;

import com.example.demo.models.AbstractBaseEntity;
import com.example.demo.models.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface AbstractBaseRepository<T extends AbstractBaseEntity> extends CrudRepository<T, Long> {

    @Query("select p from #{#entityName} p where p.deleted = 0")
    public List<T> findAll();

}
