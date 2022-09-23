package com.question_1;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> b = new ArrayList<>();
	void addBook(Book book)throws BookException{
		try {
			if(b!=book)
			b.add(book);
		} catch (Exception e) {
System.out.println("Book already added");		
}
	}
	
	List viewAllBooks()throws BookException{
	try {
		
	} catch (Exception e) {
		System.out.println("Books not available");
	}
	return b;
	}
	
	List viewBooksByAuthor(String author)throws BookException{
		try {
			if(author.equals(author)) {
				return b;
			}
		} catch (Exception e) {
System.out.println("By this author books not avilaible");		}
		return b;
	}
	
	Book getBookByISBN(int isbn)throws BookException{
		try {
			if(isbn==isbn) {
				return (Book) b;
			}
		} catch (Exception e) {
System.out.println("books with this isbn no is not avilable");		}
		return (Book) b;
	}
}
