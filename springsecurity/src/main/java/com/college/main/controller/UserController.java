package com.college.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.main.models.User;
import com.college.main.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userservice;
	@GetMapping("/getall")
	public List<User> getAllUser()
	{
		return userservice.getAllUser();
	}
	@GetMapping("/getall/{username}")
	public User getuser(@PathVariable String username)
	{
		return userservice.getUser(username);
	}
	@PostMapping("/add")
	public User add(@RequestBody User user)
	{
		return userservice.adduser(user);
	}
}
