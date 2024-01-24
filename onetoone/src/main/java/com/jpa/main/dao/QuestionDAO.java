package com.jpa.main.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.main.entities.Question;

public interface QuestionDAO extends CrudRepository<Question, Integer>{

}
