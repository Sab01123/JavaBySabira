package com.question_3;

public class Employee extends Member {

	String	Specialisation;
	String Department;
	@Override
	public String toString() {
		return "Employee [Specialisation=" + Specialisation + ", Department=" + Department + ", name=" + name + ", age="
				+ age + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + ", Salary=" + Salary + "]";
	}
	
}
