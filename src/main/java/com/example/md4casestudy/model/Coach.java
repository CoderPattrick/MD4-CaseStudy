package com.example.md4casestudy.model;

import com.example.md4casestudy.model.user.AppUser;

import javax.persistence.*;

@Entity
@Table(name = "coach")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String DoB;
    @ManyToOne
    @JoinColumn(name = "nationality_id")
    private Nationality nationality;
    private String base_salary;
    private String cv;
    @OneToOne
    @JoinColumn(name = "user_id")
    private AppUser user;

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

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

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String doB) {
        DoB = doB;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public String getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(String base_salary) {
        this.base_salary = base_salary;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public Coach(String name, String doB, Nationality nationality, String base_salary, String cv) {
        this.name = name;
        this.DoB = doB;
        this.nationality = nationality;
        this.base_salary = base_salary;
        this.cv = cv;
    }

    public Coach() {
    }

    public Coach(Long id, String name, String doB, Nationality nationality, String base_salary, String cv) {
        this.id = id;
        this.name = name;
        DoB = doB;
        this.nationality = nationality;
        this.base_salary = base_salary;
        this.cv = cv;
    }
}
