package com.jpa.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.main.entities.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer>{

}
