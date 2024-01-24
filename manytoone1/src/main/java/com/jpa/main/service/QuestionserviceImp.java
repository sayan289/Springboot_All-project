package com.jpa.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.main.dao.MyDAO;
import com.jpa.main.entities.Questionmanytoone;
@Component
public class QuestionserviceImp implements Questionservice{
	@Autowired
	private MyDAO dao;
	public Questionmanytoone add(Questionmanytoone question)
	{
		dao.save(question);
		return question;
	}

}
