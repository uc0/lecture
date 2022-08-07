package com.example.demo.chapter01.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class User {

    @Id
    private Long id;

    private String name;

    private int age;

}
