package com.question_3;

public class TemporaryEmployee extends Employee{

	int hoursWorked;
	int hourlyWages;
	TemporaryEmployee p1;
	public TemporaryEmployee() {

		// TODO Auto-generated constructor stub
	}
	public TemporaryEmployee(int employeeId,String employeeName ,int hoursWorked, int hourlyWages) {
		super();
//		calculateSalary();

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	    calculateSalary();
		this.salary=p1.getSalary();

	}


	@Override
	public void calculateSalary() {
		double salary = hoursWorked * hourlyWages;	
		 p1 = new TemporaryEmployee();
	  	p1.setSalary(salary);

		
	}
	
	

}
