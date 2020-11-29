package com.example.demo.repository;

import com.example.demo.models.Item;
import com.example.demo.abstracts.AbstractBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends AbstractBaseRepository<Item>{
}