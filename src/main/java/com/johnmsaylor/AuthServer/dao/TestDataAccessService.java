package com.johnmsaylor.AuthServer.dao;

import com.johnmsaylor.AuthServer.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("test")
public class TestDataAccessService implements UserDao{
    List<User> db = new ArrayList<>();

    @Override
    public void insertUser(User user) {
        db.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return db;
    }
}
