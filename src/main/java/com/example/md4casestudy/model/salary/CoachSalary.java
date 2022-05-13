package com.example.md4casestudy.model.salary;

import com.example.md4casestudy.model.coach.Coach;

import javax.persistence.*;

@Entity
@Table(name = "coach_salary")
public class CoachSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;
    private String first_day_of_the_week;
    private double weekly_salary;


    public CoachSalary() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public String getFirst_day_of_the_week() {
        return first_day_of_the_week;
    }

    public void setFirst_day_of_the_week(String first_day_of_the_week) {
        this.first_day_of_the_week = first_day_of_the_week;
    }

    public double getWeekly_salary() {
        return weekly_salary;
    }

    public void setWeekly_salary(double weekly_salary) {
        this.weekly_salary = weekly_salary;
    }

    public CoachSalary(Coach coach, String first_day_of_the_week, double weekly_salary) {
        this.coach = coach;
        this.first_day_of_the_week = first_day_of_the_week;
        this.weekly_salary = weekly_salary;
    }

    public CoachSalary(Long id, Coach coach, String first_day_of_the_week, double weekly_salary) {
        this.id = id;
        this.coach = coach;
        this.first_day_of_the_week = first_day_of_the_week;
        this.weekly_salary = weekly_salary;
    }
}
