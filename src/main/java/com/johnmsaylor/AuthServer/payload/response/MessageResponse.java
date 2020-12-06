package com.johnmsaylor.AuthServer.payload.response;

public class MessageResponse {
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void getMessage(String message){
        this.message = message;
    }
}
