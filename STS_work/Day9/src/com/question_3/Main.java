package com.question_3;

public class Main {

	public static void main(String[] args) {

		Manager m  = new Manager();
		m.name = "Sabira";
		m.age = 25;
		m.PhoneNumber = "123456789";
		m.Address = "Srinagar";
		m.Salary = 80000;
		m.Specialisation = "Managing";
		m.Department = "IT";
		
		
		Employee e = new Employee();
		e.name = "Noor";
		e.age = 26;
		e.PhoneNumber = "987654321";
		e.Address = "Patna";
		e.Salary = 95000;
		e.Specialisation = "Software Developer";
		e.Department = "IT";
		
		System.out.println(m);
		
		System.out.println(e);
		
		m.printSalary();
		e.printSalary();
	}

}
