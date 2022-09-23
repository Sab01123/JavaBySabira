package com.question_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws BookException {

		List<Book> list = new ArrayList<>();
		Library m1 = new Library();
		Scanner sc = new Scanner(System.in);
		try {
			
while(true) {
	System.out.println("Enter your choice");
     int n = sc.nextInt();
     
     if(n==1) {
    	 System.out.println("Enter isbn no");
    	 int isbnNo = sc.nextInt();
    	 
    	 System.out.println("Enter book name");
    	 String bookename = sc.next();
    	 
    	 System.out.println("Enter the author name: ");
    	 String auth = sc.next();
    	 
    	 list.add(new Book(isbnNo, bookename, auth));
     }
     
     else if(n==2) {
    	 
    	 m1.viewAllBooks();
     }
     else if(n==3) {
    	 System.out.println("enter author name");
    	 String au = sc.next();
    	 m1.viewBooksByAuthor(au);
     }
     else if(n==4) {
    	 System.out.println("Enter isbn no");
    	 int isb = sc.nextInt();
    	 
    	 m1.getBookByISBN(isb);
     }
     else if(n==5){
    	 System.out.println("Exist");
    	 break;
     }
     else {
    	 System.out.println("Please enter valid number");
     }
}
			
			
		} catch (BookException be) {
System.out.println(be.getMessage());
		}catch (InputMismatchException i) {
			System.out.println("You can enter only number value");
		}
		catch (Exception e) {
System.out.println(e.getMessage());	
}finally {
	System.out.println("Thank You");
}
	}

}
