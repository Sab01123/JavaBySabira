package com.question_1;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static Person generatePerson(Person person) {
		return person;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student id");
		int id = sc.nextInt();
		System.out.println("enter course");
		String course = sc.next();
		System.out.println("enter fees");
		int fees = sc.nextInt();
		
		Person stu = new Student(id, course, fees);
	stu.name = "sabira";
	stu.gender = "female";
	stu.address =new Address("srinagar", "j&k", "190008");
	//Person stu1 = stu
 Person stu1 = generatePerson(stu);
	
	System.out.println();
  Person ins = new Instructor(13, 10000);
  ins.name = "sab";
  ins.gender = "m";
  ins.address = new Address("delhi", "Delhi", "123456");
  
 Person ins1 =  generatePerson(ins);
 
 System.out.println(stu1);
 System.out.println(ins1);

    

	}
	

}
