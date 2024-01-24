package com.jpa.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.jpa.main.entities.Book;

public interface BookService {
	public Book addbook(Book details);
	public Iterable<Book> getbook();
//	public Optional<Book> getonebook(int bid);
	public Book getonebook(int bid);
	public Book update(Book details);
	public String updatebyid(int bid, Book book);
	public String getdel(int bid);
	public List<String> getAllname();
	public String delete(int bid);
}
