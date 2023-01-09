package com.masai;

import java.io.Serializable;

public class Student extends Person implements Serializable{

	private int roll_no;
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll_no, int marks) {
		super();
		this.roll_no = roll_no;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", marks=" + marks + "]";
	}
	
	
	
}

//(roll_no, marks, no-args constr, param constr)
