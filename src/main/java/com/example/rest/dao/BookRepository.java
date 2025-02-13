package com.example.rest.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	Optional<Book> findByIdAndAuthor(int id, String author);

	Optional<Book> findById(int id);

	Optional<Book> findByAuthor(String author);
}
