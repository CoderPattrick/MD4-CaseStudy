package com.example.md4casestudy.model.salary;

import javax.persistence.*;

@Entity
@Table(name = "week")
public class Week {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String first_day_of_the_week;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_day_of_the_week() {
        return first_day_of_the_week;
    }

    public void setFirst_day_of_the_week(String first_day_of_the_week) {
        this.first_day_of_the_week = first_day_of_the_week;
    }

    public Week(String first_day_of_the_week) {
        this.first_day_of_the_week = first_day_of_the_week;
    }

    public Week() {
    }

    public Week(Long id, String first_day_of_the_week) {
        this.id = id;
        this.first_day_of_the_week = first_day_of_the_week;
    }
}
