package com.springboot;

import com.springboot.dao.UserDAO;
import com.springboot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);
//		User user=new User();
//		user.setName("sayan");
		UserDAO dao=context.getBean(UserDAO.class);
		//dao.save(user);
//		User user1=new User();
//		user1.setName("subhajit");
		//User result=dao.save(user1);
		//System.out.println(result);
//		User user2=new User();
//		user2.setName("Arghay");
//		User user3=new User();
//		user3.setName("Rahul");
//		List<User> users= List.of(user2,user3);
		//dao.saveAll(users);
//		Optional<User> option=dao.findById(1);
//		User user4=option.get();
//		user4.setName("Sayan Adhikary");
//		dao.save(user4);
//		System.out.println(user4);
//		Iterable<User>itr=dao.findAll();
//		Iterator<User>iterator= itr.iterator();
//		while(iterator.hasNext())
//		{
//			User sayan=iterator.next();
//			System.out.println(sayan);
//		}
		dao.deleteById(53);
		dao.deleteById(52);
	}
}
