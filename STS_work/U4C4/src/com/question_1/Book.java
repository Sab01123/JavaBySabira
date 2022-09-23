package com.question_1;

import java.util.HashSet;
import java.util.Objects;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Book {
	
    int	bookId;
	String bookName;
	String author;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	


	@Override
	public int hashCode() {
		return Objects.hash(this.bookId);
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(author, other.author) && bookId == other.bookId
//				&& Objects.equals(bookName, other.bookName);
		Book b = this;
		Book b1 = (Book) obj;
		return (b.bookId==b1.getBookId());
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	
}
