package com.jpa.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.main.entities.Questionmanytoone;

public interface QuestionRepo extends CrudRepository<Questionmanytoone, Integer>{

}
