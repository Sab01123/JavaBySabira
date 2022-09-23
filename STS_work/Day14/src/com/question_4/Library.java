package com.question_4;

import java.util.ArrayList;
import java.util.List;

public class Library {

	
	List<Book> bookList = new ArrayList<>();
	
	void addBook(Book book) {
	   bookList.add(book);
	}
	
	 boolean isEmpty() {
		 if(bookList.size()==0) {
			 return false;
		 }
		 return true;
	 }
	
	 List<Book> viewAllBooks(){
		 return bookList;
	 }
	 
	 List<Book> viewBooksByAuthor(String author ){
		 List<Book> byA = new ArrayList<>();
		 
		 for(Book i:bookList) {
			 if(i.getAuthor().equalsIgnoreCase(author)) {
				 byA.add(i);
			 }
		 }
		 return byA;
	 }
	 
	 int countNoOfBook(String bookName) {
		 int c=0;
		 for(Book i:bookList ) {
			 if(i.getBookName().equalsIgnoreCase(bookName)) {
				 c++;
			 }
		 }
		 return c;
	 }
}
