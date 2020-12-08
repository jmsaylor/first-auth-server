package com.johnmsaylor.AuthServer.payload.response;

import java.util.List;

public class FullJwtResponse extends BasicJwtResponse{

    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private List<String> roles;

    public FullJwtResponse(String token, Long id, String username, String email, List<String> roles) {
        super(token);
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
