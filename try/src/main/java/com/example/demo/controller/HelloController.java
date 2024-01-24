package com.example.demo.controller;

import com.example.demo.entity.User1;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {
    public String display()
    {
        return "index.html";
    }
    private final UserService userService;
    @Autowired
    public HelloController(UserService userService)
    {
        this.userService=userService;
    }
    @GetMapping
    public List<User1> findAll(){return userService.findAllUser();}

}