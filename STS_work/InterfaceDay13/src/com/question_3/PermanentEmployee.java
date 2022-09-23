package com.question_3;

public class PermanentEmployee extends Employee {

private	double basicPay;

PermanentEmployee p1;


	@Override
	public void calculateSalary() {
		 p1 = new PermanentEmployee();
		
	  double salary = (basicPay-basicPay * 0.12);
	  	p1.setSalary(salary);
		
	}
	
	public PermanentEmployee() {

		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int employeeId,String employeeName ,double basicPay) {
		super();
		this.basicPay = basicPay;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		calculateSalary();
		this.salary=p1.getSalary();

	}

	
	
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	

}
