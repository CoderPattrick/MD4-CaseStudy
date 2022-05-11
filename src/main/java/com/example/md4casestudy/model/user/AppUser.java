package com.example.md4casestudy.model.user;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user_name;
    private String email;
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private AppRole role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    public AppUser() {
    }

    public AppUser(String user_name, String email, String password, AppRole role) {
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public AppUser(Long id, String user_name, String email, String password, AppRole role) {
        this.id = id;
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
