package com.question_3;

public abstract class Employee {

protected int employeeId;
protected String employeeName;
protected double salary;



public Employee() {
	// TODO Auto-generated constructor stub
}



public Employee(int employeeId, String employeeName) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
}

public abstract void calculateSalary();

	


public int getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

}
