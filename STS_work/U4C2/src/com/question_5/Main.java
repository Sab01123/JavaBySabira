package com.question_5;

import java.util.Scanner;

public class Main {
	static Employee obj = new Employee();

	public static Employee getEmployeeDetails() {

		
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Main objMain = new Main();
Scanner s = new Scanner(System.in);
//Employee obj = new Employee();
System.out.println("enter id");
int id=s.nextInt();

System.out.println("enter pf");
int pf = s.nextInt(); 

System.out.println("enter salary");
int sala = s.nextInt();
System.out.println("Enter name: ");
String name = s.next();

obj.setEmployeeId(id);
obj.setEmployeeName(name);
obj.setSalary(sala);
obj.calculateNetSalary(pf);
double net = obj.getNetSalary();
obj.setNetSalary(net);

Employee employee=Main.getEmployeeDetails();

System.out.println("Id "+ employee.getEmployeeId());
System.out.println("Name "+ employee.getEmployeeName());
System.out.println("Salary "+ employee.getSalary());
System.out.println("NetSalary"+ employee.getNetSalary());

	}
}
