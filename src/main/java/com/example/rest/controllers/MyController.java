package com.example.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.entity.Book;
import com.example.rest.services.BookService;

@RestController
public class MyController {

	@Autowired
	private BookService bookServices;

	/*
	 * desc: This method is used to check if the endPoints are working properly or
	 * not
	 */
	@GetMapping("/health")
	public ResponseEntity<String> getHealth() {
		return ResponseEntity.status(HttpStatus.OK).body("hola");
	}

	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		book = bookServices.addBook(book);
		return ResponseEntity.status(HttpStatus.CREATED).body(book);
	}

	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> books = bookServices.getAllBooks();
		if (books.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(books);
	}

	@GetMapping("/book/{id}")
	public ResponseEntity<Optional<Book>> getBookById(@PathVariable("id") int id) {
		Optional<Book> book = bookServices.getBookById(id);
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(book);
	}

	@GetMapping("/book/author/{author}")
	public ResponseEntity<Optional<Book>> getBookAuthor(@PathVariable("author") String author) {
		Optional<Book> book = bookServices.getBookAuthor(author);
		if (book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(book);
	}

//	@GetMapping("/books/book/{book}")
//	public Book getBook(@PathVariable("book") String book) {
//		return services.getBook(book);
//	}

//	@DeleteMapping("/Books/{id}")
//	public Book deleteBook(@PathVariable("id") int bookid) {
//		return services.deleteBook(bookid);
//	}
}
