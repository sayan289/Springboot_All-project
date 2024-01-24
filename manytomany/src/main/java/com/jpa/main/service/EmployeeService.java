package com.jpa.main.service;

import org.springframework.stereotype.Service;

import com.jpa.main.entities.Employee;
@Service
public interface EmployeeService {
	public Employee addemployee(Employee e);
}
