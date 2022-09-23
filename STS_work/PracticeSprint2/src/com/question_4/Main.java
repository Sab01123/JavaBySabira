package com.question_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		
		 Scanner scanner = new Scanner(System.in); 
		 
	    	System.out.println("enter your name");
	    	

      String nameString = scanner.nextLine();
      System.out.println("enter your roll");
      int roll = scanner.nextInt();
      System.out.println("enter your marks");
      int marks = scanner.nextInt();
  	System.out.println("enter your age");
      int age = scanner.nextInt();
      if(age>18 && age<60 && marks>0 && marks<500) {
    	s.setAge(age);
    	s.setMarks(marks);
    	s.setName(nameString);
    	s.setRoll(roll);
    	
      }
System.out.println("this is your name " + s.getName());
System.out.println("Roll is : "+ s.getRoll());
System.out.println("Age is : "+ s.getAge());
System.out.println("Marks is : "+ s.getMarks());
	}

}
