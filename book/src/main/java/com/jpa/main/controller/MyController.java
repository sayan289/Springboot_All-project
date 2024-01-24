package com.jpa.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.main.entities.Book;
import com.jpa.main.service.BookService;

@RestController
@RequestMapping("/book")
public class MyController {
		@Autowired
		BookService student;
		@PostMapping("/add")
		public Book addbook(@RequestBody Book book)
		{
			return student.addbook(book);
		}
		@GetMapping("/fetch")
		public Iterable<Book> getbook()
		{
			return student.getbook();
		}
//		@GetMapping("/fetch/{bid}")
//		public Optional<Book> getonebook(@PathVariable String bid)
//		{
//			return student.getonebook(Integer.parseInt(bid));
//		}
		@GetMapping("/fetch/{bid}")
		public Book getonebook(@PathVariable String bid)
		{
			return student.getonebook(Integer.parseInt(bid));
		}
		@PutMapping("/update")
		public Book update(@RequestBody Book book)
		{
			return student.update(book);
		}
		@PutMapping("/update/{bid}")
		public String updatebyid(@PathVariable String bid,@RequestBody Book book)
		{
			return student.updatebyid(Integer.parseInt(bid),book);
		}
		@DeleteMapping("/delete/{bid}")
		public String getdel(@PathVariable String bid)
		{
			return student.getdel(Integer.parseInt(bid));
		}
		@GetMapping("/allname")
		public List<String> getAllname()
		{
			return student.getAllname();
		}
		@DeleteMapping("/delete1/{bid}")
		public String delete(@PathVariable String bid)
		{
			return  student.delete(Integer.parseInt(bid));
		}
}
