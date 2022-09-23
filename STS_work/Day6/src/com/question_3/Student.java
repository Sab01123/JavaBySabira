package com.question_3;

public class Student {
	 int roll;
	String name;
	String address;
	String collageName;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", collageName=" + collageName
				+ "]";
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCollageName() {
		return collageName;
	}
	public Student() {
		
	}
	public Student(int roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}
	public Student(int roll, String name, String address ) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT==true) {
		Student	S1 = new Student(12, "Sab", "Srinagar");
		S1.collageName = "NIT";
		return S1;
		}
		else {
			Student  s2 = new Student(15, "Noor", "Patna","other collage");
			return s2;
		}
	}
}
