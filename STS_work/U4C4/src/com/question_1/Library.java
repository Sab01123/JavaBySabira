package com.question_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Library {
	
	

	public static void main(String[] args) {

//		ArrayList<Book> booksCollection  = new ArrayList<>();
		
//		Book listbook = new Book();//s
//		LinkedHashSet<Book> booksCollection = new LinkedHashSet<>();
//		HashSet<Book> booksCollection = new HashSet<>();
		
		Set<Book> booksCollection = new HashSet<>();
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));

//		LinkedHashSet<Book> l1 = new LinkedHashSet<>(booksCollection);
		
//		System.out.println(l1);
		
//		HashSet<Book> h1 = new HashSet<>();
//		booksCollection = new ArrayList<>(l1);
//		System.out.println(booksCollection);
//		for(Book i: booksCollection) {
//			h1.add(i);
//		}
//		System.out.println(h1);
		for(Book i:booksCollection) {
			System.out.println(i);
		}
	}

}
