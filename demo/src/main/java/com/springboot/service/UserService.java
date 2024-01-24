package com.springboot.service;

import com.springboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAllUser();
}
