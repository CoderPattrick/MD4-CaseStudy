package com.example.md4casestudy.model;

import javax.persistence.*;

@Entity
@Table(name = "performance")
public class Performance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Performance(String name) {
        this.name = name;
    }

    public Performance() {
    }

    public Performance(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
