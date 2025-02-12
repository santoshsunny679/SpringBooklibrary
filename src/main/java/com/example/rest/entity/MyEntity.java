package com.example.rest.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MyBook")
public class MyEntity {
	
 private int book;
 private int price;
 private String author;
 @Id
 private int id;
 
 
public MyEntity(int book, int price, String author, int id) {
	super();
	this.book = book;
	this.price = price;
	this.author = author;
	this.id = id;
}


public MyEntity() {
	super();
	// TODO Auto-generated constructor stub
}


public int getBook() {
	return book;
}


public void setBook(int book) {
	this.book = book;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
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


@Override
public String toString() {
	return "MyEntity [book=" + book + ", price=" + price + ", author=" + author + ", id=" + id + "]";
}
 
 
}
