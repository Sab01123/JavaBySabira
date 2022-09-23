package com.question_4;

import java.util.Scanner;

public class Demo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Details of student 1");
     System.out.println("Enter Roll number");
     int roll1 = sc.nextInt();
     System.out.println("Enter Name");
     String name1 = sc.next();
     System.out.println("Enter Marks");
     int marks1 = sc.nextInt();
     
     System.out.println("Details of student 2");

     System.out.println("Enter Roll number");
     int roll2 = sc.nextInt();
     System.out.println("Enter Name");
     String name2 = sc.next();
     System.out.println("Enter Marks");
     int marks2 = sc.nextInt();
		
		Student s1 = new Student();
		Student s2 = new Student();
		s1.stu=new Student(roll1, name1, marks1,1);
		s2.stu = new Student(roll2, name2, marks2,2);
		
		s1.displayDetails();
		s2.displayDetails();

	}

}
