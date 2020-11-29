package com.example.demo.models;

import com.example.demo.abstracts.AbstractBaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="ITEM")
public class Item extends AbstractBaseEntity {

    @Column(name="NAME")
    String name;

    @Column(name="PRICE")
    long price;


}
