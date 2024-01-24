package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User1;
import com.example.demo.entity.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImp implements UserService{
    private final UserDAO userDao;
    @Autowired
    public UserServiceImp(UserDAO userDAO)
    {
        this.userDao=userDAO;
    }
    public List<User1> findAllUser(){return userDao.findAll();}
}