package com.jpa.main.controller;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.main.entities.Questionmanytoone;
import com.jpa.main.service.Questionserviceinterface;

@RestController
@RequestMapping("/manytoall")
public class Controlleronetomany {
	@Autowired
	Questionserviceinterface question;
	@PostMapping("/add")
	public Questionmanytoone addquestion(@PathVariable Question question)
	{
		return question
	}
}
