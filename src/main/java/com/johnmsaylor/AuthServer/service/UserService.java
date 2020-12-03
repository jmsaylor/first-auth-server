package com.johnmsaylor.AuthServer.service;

import com.johnmsaylor.AuthServer.dao.UserDao;
import com.johnmsaylor.AuthServer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("test") UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUser(User user) {
        userDao.insertUser(user);
    }
}
