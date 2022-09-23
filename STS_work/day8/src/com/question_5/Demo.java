package com.question_5;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Demo {

	public static void main(String[] args) {
        
		int c = 0;
		int x = 1;
        int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		 int noStu = sc.nextInt();
		 
		 Student [] arr = new Student[noStu];
		
		 
		 for(Student i: arr) {
			 System.out.println("Enter details of student " + (c+x));
			
			 
			 System.out.println("Student roll");
			int roll =  sc.nextInt();

			 System.out.println("Student name");
			String name =  sc.next();

			 System.out.println("Student address");
			 String add  = sc.next();

			 System.out.println("Student marks");
			 
			int marks =  sc.nextInt();

			arr[c] = new Student(roll, name, add, marks);
			c++;
             sum = sum+marks;
			
			
		 }
		 
		 float average = (float)sum/noStu;
		
		 for(Student k : arr) {
			 System.out.println(k);
		 }
		 System.out.println(average);
	}

}
