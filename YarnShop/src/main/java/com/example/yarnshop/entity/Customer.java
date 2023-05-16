package com.example.yarnshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
