package com.johnmsaylor.AuthServer.api;

import com.google.gson.Gson;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.johnmsaylor.AuthServer.model.Payload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class Controller {

//    @Autowired
//    private Gson gson;

    @PostMapping("/")
    public String main(@RequestBody Payload payload) {
//        JsonObject payload = JsonParser.parseString(body).getAsJsonObject();
//        String action = payload.get("action").getAsString();
        String response = "Y";
        System.out.println(payload.getAction());
        System.out.println(payload.getData());


        switch (payload.getAction())
        {
            case "ADD_USER":


                break;
            default:
                response = "INVALID";
        }

        return response;
    }
    
}
