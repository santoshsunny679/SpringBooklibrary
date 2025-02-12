package com.example.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.controllers.Book;
import com.example.rest.dao.BookRepository;

@Service
public class Services {
	@Autowired
	private BookRepository bookrepository;
//	public static List<Book> list = new ArrayList<>();
//	static {
//		list.add(new Book("Java", "Santosh", 123, 24000));
//		list.add(new Book("python", "Aishwarya", 124, 23000));
//		list.add(new Book("Dotnet", "Zeenath", 125, 25000));
//		list.add(new Book("PHP", "Abhishek", 126, 26000));
//		list.add(new Book("C++", "Satish", 127, 27000));		
//	}
	
	public Book getBookById(int id) {
		Book book=null;
		try {
			book=this.bookrepository.findById(id);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return book;
	}
	
	public List<Book> getBooks(){
		List<Book> list= (List<Book>)bookrepository.findAll();
		return list; 
	}
	
	public Book getBookAuthor(String author) {
		Book book=bookrepository.findByAuthor(author);
//		for(Book book: list) {
//			if(book.getAuthor().equalsIgnoreCase(author)) {
//				System.out.println("data is sent");
//				return book;
//				
//			}
//		}
     	return book;
		
	}
//	
//	public Book getBook(String book) {
//		for(Book b:list) {
//			if(b.getBook().equalsIgnoreCase(book)) {
//				System.out.println("Book found");
//				return b;
//			}
//		}
//		return null;
//	}
	
	public Book addBook(Book book) {
		Book result=bookrepository.save(book);
		return result;
	}
	
//	public Book deleteBook(int bookid) {
//		for(Book book:list) {
//			if(book.getId()==bookid) {
//			list.remove(book);
//			return book;
//			}
//		}
//		
//		return null;
		
	//}
}
