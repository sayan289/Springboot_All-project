package com.jpa.main.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Questionmanytoone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionid;
	private String question;
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Answermanytoone.class)
	@JoinColumn(name="question_id",referencedColumnName = "questionid")
	private List<Answermanytoone> answer;
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answermanytoone> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answermanytoone> answer) {
		this.answer = answer;
	}
	
	
}
