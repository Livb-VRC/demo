package com.example.demo.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Subselect;
import org.springframework.data.annotation.Immutable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="ITEM")
public class Item extends AbstractBaseEntity{

    @Column(name="NAME")
    String name;

    @Column(name="PRICE")
    long price;


}
