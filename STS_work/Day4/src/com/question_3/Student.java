package com.question_3;

public class Student {
	int roll;
	String name;
	int marks;
  void displayStudentDetails() {
System.out.println("Roll is :"+roll);
System.out.println("Name is :"+name);
System.out.println("Marks is :"+marks);

  }
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		obj1.roll = 140;
		obj1.name = "Sabira";
		obj1.marks=99;
		obj1.displayStudentDetails();
		Student obj2 = new Student();
		obj2.roll = 111;
		obj2.name = "Noor";
		obj2.marks=100;
		obj2.displayStudentDetails();
      System.gc();
	}

}
