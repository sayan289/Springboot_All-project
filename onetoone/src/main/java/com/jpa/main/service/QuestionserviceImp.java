package com.jpa.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.main.dao.QuestionDAO;
import com.jpa.main.entities.Question;

@Component
public class QuestionserviceImp implements Questionservice{
	@Autowired
	QuestionDAO dao;
	public Question addquestion(Question qs)
	{
		dao.save(qs);
		return qs;
	}

}
