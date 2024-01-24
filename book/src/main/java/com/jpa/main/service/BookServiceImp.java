package com.jpa.main.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.main.dao.BookDAO;

import com.jpa.main.entities.Book;

import jakarta.transaction.Transactional;

@Component
public class BookServiceImp implements BookService {
	@Autowired
	BookDAO dao;

	@Override
	public Book addbook(Book details) {
		dao.save(details);
		return details;
	}
	public Iterable<Book> getbook()
	{
		return dao.findAll();
	}
	public Book getonebook(int bid)
	{
		return dao.findByBookId(bid);
	}
	public Book update(Book details)
	{
		return dao.save(details);
	}
	public String updatebyid(int bid,Book book)
	{
		Optional<Book> info=dao.findById(bid);
		if(info.isPresent())
		{
			book.setBid(bid);
			dao.save(book);
			return "updated";
		}
		else
		{
			return "id not present";
		}
	}
	public String getdel(int bid)
	{
		Optional<Book>getdeleob=dao.findById(bid);
		if(getdeleob.isPresent())
		{
			dao.deleteById(bid);
		    return "Deleted";
		}
		else
		{
			return "Id does not exists Present";
		}
	}
	public List<String> getAllname()
	{
		return dao.findAllName();
	}
	@Transactional
	public String delete(int bid)
	{
		Optional<Book> option=dao.findById(bid);
		if(option.isPresent())
		{
			dao.deletemyself(bid);
			return "delete";
		}
		else
			return "Not present";
	}
}
