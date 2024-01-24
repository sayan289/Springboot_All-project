package com.example.demo;

import com.example.demo.entity.User1;
import com.example.demo.entity.User2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class TryApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(TryApplication.class, args);
		User2 user2=context.getBean(User2.class);
		user2.discuss();
	}

}
