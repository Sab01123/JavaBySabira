package com.question_1;

public class Instructor extends Person{
	int instructorId;
	int salary;

	public Instructor() {
		// TODO Auto-generated constructor stub
	}

	public Instructor(int instructorId, int salary) {
		super();
		this.instructorId = instructorId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Instruction [instructorId=" + instructorId + ", salary=" + salary + ", name=" + name + ", gender="
				+ gender + ", address=" + address + "]";
	}
	
	

	
}
