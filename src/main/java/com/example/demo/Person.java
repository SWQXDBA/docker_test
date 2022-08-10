package com.example.demo;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@ToString
public class Person {
    @Id
            @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "gen")
            @SequenceGenerator(name = "gen",sequenceName = "person_sec")
    Long id;
    String name;
}
