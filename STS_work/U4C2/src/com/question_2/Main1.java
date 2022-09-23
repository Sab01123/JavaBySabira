package com.question_2;

import java.util.Scanner;


public class Main1 {

	public static void main(String[] args) {
     
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter");
		int noStu = scanner.nextInt();
		int c=0;
		while(true) {
			c++;
		System.out.println("Enter Roll Number");
		int roll = scanner.nextInt();
		
		System.out.println("Enter Name");
		String name = scanner.next();
		
		System.out.println("Enter Marks");
        int marks = scanner.nextInt();

        Student s = new Student();
        Student s2 = new Student(roll, name, marks);
    	s.setStudentName(name);;
    	s.setRollNumber(roll);
    	s.setMarks(marks);
    	s.setMarks(marks);
    	System.out.println("Student Detail"+" "+ c);
    	System.out.println("Student roll number :"+" "+s.getRollNumber());
    	System.out.println("Student name  :"+" "+s.getStudentName());
    	System.out.println("Student Marks  :"+" "+s.getMarks());
    	System.out.println("=======================================================================================================");
	   if (c>=noStu) {
		   break;
	   }
	   
	}
	}	

}
