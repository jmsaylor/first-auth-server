package com.johnmsaylor.AuthServer.payload.response;

public class BasicJwtResponse {

    private String token;

    public BasicJwtResponse(String token){
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
