package com.johnmsaylor.AuthServer.dao;

import com.johnmsaylor.AuthServer.model.User;

import java.util.List;

public interface UserDao {
    void insertUser(User user);
    List<User> getAllUsers();
}
