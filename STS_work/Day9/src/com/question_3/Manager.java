package com.question_3;

public class Manager extends Member{

String	Specialisation;
	String Department;
	@Override
	public String toString() {
		return "Manager [Specialisation=" + Specialisation + ", Department=" + Department + ", name=" + name + ", age="
				+ age + ", PhoneNumber=" + PhoneNumber + ", Address=" + Address + ", Salary=" + Salary + "]";
	}

}