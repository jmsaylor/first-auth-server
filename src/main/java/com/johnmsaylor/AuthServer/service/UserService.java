package com.johnmsaylor.AuthServer.service;

import com.johnmsaylor.AuthServer.model.User;
import com.johnmsaylor.AuthServer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository database;

    public User addUser(User user) {
        return database.save(user);
    }

    public List<User> getUsers() {
        return database.findAll();
    }
}
