package com.question_1;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
	
		System.out.println("enter roll");
		int roll = sc.nextInt();
		
		

		System.out.println("age");
		int age = sc.nextInt();
		System.out.println("marks");
		int marks = sc.nextInt();
        Student s = new Student();
        
if(age>18 && age<60 && marks >0 && marks<500) {
	Student s2 = new Student(roll, name, age, marks);
	s.setName(name);
	s.setRoll(roll);
	s.setAge(age);
	s.setMarks(marks);
System.out.println("age is "+ s.getAge()+" "+s.getMarks()+" " + s.getName()+" "+s.getRoll());
System.out.println(s2.getAge()+" "+s2.getMarks()+" " + s2.getName()+" "+s2.getRoll());

}
else {
	System.out.println("not valid age or marks");
}

	}

}
