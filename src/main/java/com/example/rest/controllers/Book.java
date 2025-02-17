package com.example.rest.controllers;

public class Book {

	 private String book;
	 private String author;
	 private int id;
	 private int price;
	 
	public Book(String book, String author, int id, int price) {
		super();
		this.book = book;
		this.author = author;
		this.id = id;
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [book=" + book + ", author=" + author + ", id=" + id + ", price=" + price + "]";
	}
	
	// we are using toString method here to return the book instance.
	 
	 
	 
	 
	 
	 
}

