package com.johnmsaylor.AuthServer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String email;
    private String password;

    public User() {}

    public User(@JsonProperty("email") String email, @JsonProperty("password") String password) {
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


