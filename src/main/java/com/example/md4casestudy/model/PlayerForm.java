package com.example.md4casestudy.model;

import org.springframework.web.multipart.MultipartFile;


public class PlayerForm {

    private Long id;
    private String name;
    private Position position;
    private String DoB;
    private Nationality nationality;
    private Performance performance;
    private PlayerStatus status;
    private double base_salary;
    private double height;
    private double weight;
    private MultipartFile cv;
    private MultipartFile avatar;

    public PlayerForm() {
    }

    public PlayerForm(String name, Position position, String doB, Nationality nationality, PlayerStatus status, double height, double weight, MultipartFile cv, MultipartFile avatar) {
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

    public PlayerForm(String name, Position position, String doB, Nationality nationality, Performance performance, PlayerStatus status, double base_salary, double height, double weight, MultipartFile cv, MultipartFile avatar) {
        this.name = name;
        this.position = position;
        DoB = doB;
        this.nationality = nationality;
        this.performance = performance;
        this.status = status;
        this.base_salary = base_salary;
        this.height = height;
        this.weight = weight;
        this.cv = cv;
        this.avatar = avatar;
    }

    public PlayerForm(Long id, String name, Position position, String doB, Nationality nationality, Performance performance, PlayerStatus status, double base_salary, double height, double weight, MultipartFile cv, MultipartFile avatar) {
        this.id = id;
        this.name = name;
        this.position = position;
        DoB = doB;
        this.nationality = nationality;
        this.performance = performance;
        this.status = status;
        this.base_salary = base_salary;
        this.height = height;
        this.weight = weight;
        this.cv = cv;
        this.avatar = avatar;
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

    public MultipartFile getCv() {
        return cv;
    }

    public void setCv(MultipartFile cv) {
        this.cv = cv;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }
}
