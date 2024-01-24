package com.jpa.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.jpa.main.entities.Book;
@Service
public interface BookDAO extends CrudRepository<Book, Integer>{
//	@Query(value="select * from Book where bid =:b", nativeQuery = true)
//	public Book findByBookId(@Param("b") int b);
	@Query("select u from Book u where u.bid =:b")
	public Book findByBookId(@Param("b") int b);
	@Query("select bname from Book")
	public List<String> findAllName();
	@Modifying
	@Query("delete from Book where bid =:b")
	public void deletemyself(@Param("b") int b);
}
