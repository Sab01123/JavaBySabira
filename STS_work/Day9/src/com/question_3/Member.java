package com.question_3;

public class Member {

	String name;
	 int age;
	 String PhoneNumber;
	 String Address;
	 double Salary;
   void printSalary() {
	   System.out.println("Salary of "+name+" "+Salary);
   }
   
   public Member() {
	// TODO Auto-generated constructor stub
}

public Member(String name, int age, String phoneNumber, String address, double salary) {
	super();
	this.name = name;
	this.age = age;
	PhoneNumber = phoneNumber;
	Address = address;
	Salary = salary;
}


   
   
}
