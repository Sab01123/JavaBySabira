package com.question_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Library l = new Library();

		while(true) {
			System.out.println("Enter your choice");
			
			int s = sc.nextInt();
			if(s==1) {
				System.out.println("enter ISBN");
				int isbn = sc.nextInt();
				System.out.println("Enter Book Name");
				String bname = sc.next();
				System.out.println("Enter author name");
				String auth = sc.next();
				l.addBook(new Book(isbn, bname, auth));
			}
			else if(s==2) {
			List<Book>	allBook = l.viewAllBooks();
			for(Book i:allBook) {
				System.out.println(i);
			}
			}
			else if(s==3) {
				System.out.println("Search Book by author");
				String s0 = sc.next();
			List<Book> byAuth = l.viewBooksByAuthor(s0);
			
			for(Book b:byAuth) {
				System.out.println(b);
			}
			}
			else if(s==4) {
				System.out.println("enter name");
				String s1 = sc.next();
			int c =	l.countNoOfBook(s1);
			System.out.println(c);
			}
			else if(s==5) {
				System.out.println("Thank You..!!");
				break;
			}
			else {
				System.out.println("enter valid choice");
			}
			
		}
	}

}
