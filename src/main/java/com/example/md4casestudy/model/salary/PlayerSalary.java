package com.example.md4casestudy.model.salary;

import com.example.md4casestudy.model.Player;

import javax.persistence.*;

@Entity
@Table(name = "player_salary")
public class PlayerSalary{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "week_id")
    private Week week;
    private double weekly_salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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

    public PlayerSalary(Player player, Week week, double weekly_salary) {
        this.player = player;
        this.week = week;
        this.weekly_salary = weekly_salary;
    }

    public PlayerSalary(Long id, Player player, Week week, double weekly_salary) {
        this.id = id;
        this.player = player;
        this.week = week;
        this.weekly_salary = weekly_salary;
    }

    public PlayerSalary() {
    }
}
