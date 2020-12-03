package com.johnmsaylor.AuthServer.api;

import com.google.gson.Gson;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.johnmsaylor.AuthServer.model.Payload;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class Controller {

    Gson gson = new Gson().newBuilder().setPrettyPrinting().create();

    @PostMapping("/")
    public String main(@RequestBody String body) {
        JsonObject payload = JsonParser.parseString(body).getAsJsonObject();
        String action = payload.get("action").getAsString();
        String response = "Y";


        switch (action)
        {
            case "ADD_USER":


                break;
            default:
                response = "INVALID";
        }

        return response;
    }
    
}
