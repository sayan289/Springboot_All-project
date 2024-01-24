package com.example.demo.entity;
import com.example.demo.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class User2 {
    Scanner sc=new Scanner(System.in);
    @Autowired
    UserDAO dao;
    ConfigurableApplicationContext context;
    public void add()
    {
            User1 user=new User1();
            System.out.println("Enter the book name");
            String book=sc.next();
            user.setBname(book);
            dao.save(user);
            System.out.println("Book inserted");
    }
    public void delete()
    {
        User1 user=new User1();
        System.out.println("Enter the book id which name has to update ");
        int book=sc.nextInt();
        dao.deleteById(book);
        System.out.println("Book deleted");
    }
    public void update()
    {
        User1 user=new User1();
        System.out.println("Enter the book id");
        int book=sc.nextInt();
        Optional<User1> option=dao.findById(book);
        System.out.println("Enter the new book name :");
        String name=sc.next();
        User1 us=option.get();
        us.setBname(name);
        dao.save(us);
        System.out.println("Book update successfull");
    }
    public void show()
    {
        Iterable<User1>itr=dao.findAll();
		Iterator<User1>iterator= itr.iterator();
		while(iterator.hasNext())
		{
			User1 user=iterator.next();
			System.out.println(user);
		}
    }
    public void discuss()
    {
        while(true)
        {
            System.out.println("1 for insert book details");
            System.out.println("2 for delete books");
            System.out.println("3 for update the book name");
            System.out.println("4 for show all book");
            System.out.println("Enter your choice :");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:add();break;
                case 2:delete();break;
                case 3:update();break;
                case 4:show();break;
            }
        }

    }
}
