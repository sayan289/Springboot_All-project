package com.jpa.main.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
public class Questionmanytoone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Answermanytoone> answer;
	
	
	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public List<Answermanytoone> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answermanytoone> answer) {
		this.answer = answer;
	}

	private String qcontent;
	
	

}
