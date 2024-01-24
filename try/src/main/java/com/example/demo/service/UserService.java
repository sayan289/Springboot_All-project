package com.example.demo.service;

import com.example.demo.entity.User1;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User1> findAllUser();
}
