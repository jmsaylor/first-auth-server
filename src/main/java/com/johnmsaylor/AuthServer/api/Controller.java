package com.johnmsaylor.AuthServer.api;

import com.google.gson.Gson;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.johnmsaylor.AuthServer.model.Payload;
import com.johnmsaylor.AuthServer.model.User;
import com.johnmsaylor.AuthServer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class Controller {

    @Autowired
    UserService userService;

    @Autowired
    private Gson gson;

    @PostMapping("/")
    public ResponseEntity main(@RequestBody Payload payload) {
        String response = "";

        System.out.println(payload.getAction());
        System.out.println(payload.getData());


        switch (payload.getAction())
        {
            case "ADD_USER":
                User newUser = gson.fromJson(payload.getDataAsString(), User.class);
                System.out.println(newUser.getEmail() + " " + newUser.getPassword());
                var result = userService.addUser(newUser);
                response = result.getEmail();
                break;
            case "GET_TOKEN":

                break;
            case "GET_USERS":
                List<User> users = userService.getUsers();
                System.out.println(users);
                response = users.toString();
                break;
            default:
                response = "INVALID";
        }

        return ResponseEntity.ok(response);
    }
    
}
