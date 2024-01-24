package com.jpa.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.main.dao.EmployeeDAO;
import com.jpa.main.entities.Employee;

@Component
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	EmployeeDAO dao;
	public Employee addemployee(Employee e)
	{
		dao.save(e);
		return e;
	}
}
