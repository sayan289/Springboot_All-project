package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class User1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bid;
    private String bname;

    @Override
    public String toString() {
        return "User{" +
                "bname='" + bname + '\'' +
                '}';
    }

    public User1(){

    }
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
