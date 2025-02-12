package com.example.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.rest.controllers.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{
	public Book findById(int id);
	public Book findByAuthor(String author);
	

}
