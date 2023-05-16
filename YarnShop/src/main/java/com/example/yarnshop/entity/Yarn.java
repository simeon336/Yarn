package com.example.yarnshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Yarn {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String color;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}