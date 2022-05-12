package com.example.md4casestudy.model.salary;

import com.example.md4casestudy.model.Coach;

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

    @ManyToOne
    @JoinColumn(name = "week_id")
    private Week week;
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

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public double getWeekly_salary() {
        return weekly_salary;
    }

    public void setWeekly_salary(double weekly_salary) {
        this.weekly_salary = weekly_salary;
    }

    public CoachSalary(Coach coach, Week week, double weekly_salary) {
        this.coach = coach;
        this.week = week;
        this.weekly_salary = weekly_salary;
    }

    public CoachSalary(Long id, Coach coach, Week week, double weekly_salary) {
        this.id = id;
        this.coach = coach;
        this.week = week;
        this.weekly_salary = weekly_salary;
    }
}
