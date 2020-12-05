package com.johnmsaylor.AuthServer.model;

import javax.persistence.*;

@Entity
@Table(name="userz")
public class User {
    @Id
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;

    public User() {}

    public User(String email, String password, Integer id) {
        this.email = email;
        this.password = password; //TODO: Encrypt
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}


