package com.jpa.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.main.dao.QuestionRepo;
import com.jpa.main.entities.Questionmanytoone;
@Component
public class Questionserimp implements Questionserviceinterface{
	@Autowired
	QuestionRepo qaRepo;
	
	public Questionmanytoone questionAnswerAdd(Questionmanytoone question) {
		return	qaRepo.save(question);
	}
}
