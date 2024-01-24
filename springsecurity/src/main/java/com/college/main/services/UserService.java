package com.college.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.college.main.models.User;
@Service
public class UserService {
	List<User> list=new ArrayList<>();

	public UserService() {
		super();
		list.add(new User("abc","abc","abc@gmail.com"));
		list.add(new User("xyz","xyz","xyz@gmail.com"));
	}
	
	public List<User> getAllUser()
	{
		return this.list;
	}
	public User getUser(String username)
	{
		return list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);
	}
	public User adduser(User user)
	{
		this.list.add(user);
		return user;
	}
	
}
