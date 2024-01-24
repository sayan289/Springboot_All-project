package com.jpa.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.main.entities.Question;
import com.jpa.main.service.Questionservice;

@RestController
@RequestMapping("/question")
public class MyController {
	@Autowired
	Questionservice question;
	@PostMapping("/add")
	public Question addquestion(@RequestBody Question qs)
	{
		return question.addquestion(qs);
	}
}
