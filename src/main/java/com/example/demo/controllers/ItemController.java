package com.example.demo.controllers;

import com.example.demo.models.Course;
import com.example.demo.models.Item;
import com.example.demo.repository.IItemRepository;
import com.example.demo.services.IMyEntityService;
import com.example.demo.services.MyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController extends MyEntityController<Item> {
}
