package com.example.md4casestudy.model.salary;

public class Salary {
    public Salary(String first_day_of_the_week, double weekly_salary) {
        this.first_day_of_the_week = first_day_of_the_week;
        this.weekly_salary = weekly_salary;
    }

    private String first_day_of_the_week;
    private double weekly_salary;

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

    public Salary() {
    }
}
