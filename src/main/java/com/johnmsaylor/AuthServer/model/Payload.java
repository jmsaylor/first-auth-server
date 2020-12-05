package com.johnmsaylor.AuthServer.model;

import com.fasterxml.jackson.databind.JsonNode;

public class Payload {
    private String action;
    private Object data;

    public Payload() {}

    public Payload(String action, JsonNode data) {
        this.action = action;
        this.data = data;
    }

    public String getAction() {
        return action;
    }

    public Object getData() {
        return data;
    }

    public String getDataAsString() {
        return data.toString();
    }
}
