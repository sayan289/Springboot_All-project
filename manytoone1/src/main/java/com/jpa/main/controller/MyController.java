package com.jpa.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.main.entities.Questionmanytoone;
import com.jpa.main.service.Questionservice;

@RestController
@RequestMapping("/all")
public class MyController {
	@Autowired
   private Questionservice service;
	@PostMapping("/add")
	public Questionmanytoone add(@RequestBody Questionmanytoone question)
	{
		return service.add(question);
	}
}
