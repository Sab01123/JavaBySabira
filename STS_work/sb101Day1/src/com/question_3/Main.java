package com.question_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Library l1 = new Library();
		
		int i = 0;
		
		while(i<3) {
			System.out.println("member id");
			int id = sc.nextInt();
			System.out.println("member name");
			String name = sc.next();
			System.out.println("membership no");
			int memNo = sc.nextInt();
			System.out.println("date dd-MM-yyyy");
			String date = sc.next();
			
			LocalDate d1 = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

			
			
		   l1.members.add(new Members(memNo, name, memNo, d1));
		
			System.out.println("book id");
			int bookid = sc.nextInt();
			System.out.println("book name");
			String bookname = sc.next();
			System.out.println("book Author");
			String bookauth = sc.next();
			
			l1.book.add(new Books(bookid, bookname, bookauth));
			i++;
		}
		
		for(Books b:l1.book) {
			System.out.println(b);
		}
		
		List<Members> list=new ArrayList<Members>(l1.members);
		Collections.sort(list, new Memberscomp());
		
		for(Members m:list) {
			System.out.println(m);
		}
		
	}

}
