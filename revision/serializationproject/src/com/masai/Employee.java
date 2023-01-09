package com.masai;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Employee extends Person implements Serializable {

private	int salary;
private String dept;
private String work_location;

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(int salary, String dept, String work_location) {
	super();
	this.salary = salary;
	this.dept = dept;
	this.work_location = work_location;
}



@Override
public String toString() {
	return "Employee [salary=" + salary + ", dept=" + dept + ", work_location=" + work_location + "]";
}

	
}
//salary, dept, work_location, no-args constr, param
//constr) - should implement Externalizable interface so that only to save salary, dept
//state while serializing