package com.example.yarnshop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;

@Entity
public class Pattern {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
