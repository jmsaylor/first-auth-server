package com.johnmsaylor.AuthServer.model;

public class Payload {
    private String action;
    private String data;

    public Payload() {}

    public Payload(String action, String data) {
        this.action = action;
        this.data = data;
    }

    public String getAction() {
        return action;
    }

    public String getData() {
        return data;
    }
}
