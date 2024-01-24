package com.jpa.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.main.entities.Employee;
import com.jpa.main.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class MyController {
	@Autowired
	EmployeeService empservice;
	@PostMapping("/add")
	public Employee add(@RequestBody Employee emp)
	{
		return empservice.addemployee(emp);
	}
}
