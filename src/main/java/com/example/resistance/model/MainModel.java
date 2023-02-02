package com.example.resistance.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Component
@Entity(name = "models")
public class MainModel {
    @Id
    private Long id;

    @Column(name = "nameModel")
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
