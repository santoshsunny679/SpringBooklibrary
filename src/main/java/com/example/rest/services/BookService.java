package com.example.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.dao.BookRepository;
import com.example.rest.entity.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Optional<Book> getBookById(int id) {
		Optional<Book> book = null;
		try {
			book = bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	public Optional<Book> getBookAuthor(String author) {
		return bookRepository.findByAuthor(author);
	}

}
