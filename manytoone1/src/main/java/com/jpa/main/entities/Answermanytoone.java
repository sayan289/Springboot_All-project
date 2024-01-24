package com.jpa.main.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answermanytoone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerid;

    private String answercontent;

//    @ManyToOne
//    private Questionmanytoone question;

    // Getters and setters

    public int getAnswerid() {
        return answerid;
    }

    public void setAnswerid(int answerid) {
        this.answerid = answerid;
    }

    public String getAnswercontent() {
        return answercontent;
    }

    public void setAnswercontent(String answercontent) {
        this.answercontent = answercontent;
    }

//    public Questionmanytoone getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(Questionmanytoone question) {
//        this.question = question;
//    }
}
