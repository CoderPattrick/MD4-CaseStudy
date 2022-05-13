package com.example.md4casestudy.model.player;

import com.example.md4casestudy.model.Nationality;
import com.example.md4casestudy.model.Performance;
import com.example.md4casestudy.model.PlayerStatus;
import com.example.md4casestudy.model.Position;
import com.example.md4casestudy.model.user.AppUser;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
    private String DoB;
    @ManyToOne
    @JoinColumn(name = "nationality_id")
    private Nationality nationality;
    @ManyToOne
    @JoinColumn(name = "performance_id")
    private Performance performance;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private PlayerStatus status;
    private double base_salary;
    private double height;
    private double weight;
    private String cv;
    private String avatar;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public PlayerStatus getStatus() {
        return status;
    }

    public void setStatus(PlayerStatus status) {
        this.status = status;
    }

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Player() {
    }

    public Player(String name, Position position, String doB, Nationality nationality, Performance performance, PlayerStatus status, double base_salary, double height, double weight, String cv, String avatar) {
        this.name = name;
        this.position = position;
        this.DoB = doB;
        this.nationality = nationality;
        this.performance = performance;
        this.status = status;
        this.base_salary = base_salary;
        this.height = height;
        this.weight = weight;
        this.cv = cv;
        this.avatar = avatar;
    }

    public Player(String name, Position position, String doB, Nationality nationality, double height, double weight, String cv, String avatar) {
        this.name = name;
        this.position = position;
        this.DoB = doB;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
        this.cv = cv;
        this.avatar = avatar;
    }

    public Player(String name, Position position, String doB, Nationality nationality, PlayerStatus status, double height, double weight, String cv, String avatar) {
        this.name = name;
        this.position = position;
        DoB = doB;
        this.nationality = nationality;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.cv = cv;
        this.avatar = avatar;
    }

    public Player(Long id, String name, Position position, String doB, Nationality nationality, Performance performance, PlayerStatus status, double base_salary, double height, double weight, String cv, String avatar) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.DoB = doB;
        this.nationality = nationality;
        this.performance = performance;
        this.status = status;
        this.base_salary = base_salary;
        this.height = height;
        this.weight = weight;
        this.cv = cv;
        this.avatar = avatar;
    }
}
