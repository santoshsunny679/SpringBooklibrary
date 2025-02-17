package com.example.rest.controllers;

public class Book {

	 private String book;
	 private String author;
	 private int id;
	 private int price;
	 
	public Book(String book, String author, int id, int price) {
		this.book = book;
		this.author = author;
		this.id = id;
		this.price = price;
	}

	public Book() {}

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
	
	//This is santosh branch what ever the code changes I do will reflect in the santhsoh branch
	 
}

