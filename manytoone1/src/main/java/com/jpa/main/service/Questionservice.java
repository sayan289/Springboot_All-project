package com.jpa.main.service;

import com.jpa.main.entities.Questionmanytoone;
import org.springframework.stereotype.Service;

@Service
public interface Questionservice {
	public Questionmanytoone add(Questionmanytoone question);
}
