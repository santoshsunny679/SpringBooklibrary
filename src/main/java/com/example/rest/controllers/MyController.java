package com.example.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.services.Services;

@RestController
public class MyController {
	@Autowired
	private Services services;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {
	    List<Book> list = services.getBooks();
	    
	    if (list.isEmpty()) { // Better way to check if the list is empty
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    }
	    
	    return ResponseEntity.ok(list); // Correct way to return the list
	}
	
	@GetMapping("/books/id/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") int id)
	{ 
	    Book book =services.getBookById(id);
	    if(book==null) {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    	
	    }
	    System.out.println(book);
	
	 return ResponseEntity.ok(book);
	}

	
	@GetMapping("/books/author/{author}")
	public ResponseEntity<Book> getBookAuthor(@PathVariable("author") String author) {
		Book book=services.getBookAuthor(author);
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return ResponseEntity.ok(book);
	}
    
//	@GetMapping("/books/book/{book}")
//	public Book getBook(@PathVariable("book") String book) {
//		return services.getBook(book);
//	}
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book){
		//Changes done by Abhishek
		Book b= services.addBook(book);
		return b;
	}
	
//	@DeleteMapping("/Books/{id}")
//	public Book deleteBook(@PathVariable("id") int bookid) {
//		return services.deleteBook(bookid);
//	}
} 
