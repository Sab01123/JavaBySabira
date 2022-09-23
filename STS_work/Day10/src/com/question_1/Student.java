package com.question_1;

public class Student extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String courseEnrolled, int courseFee) {
		super();
		this.studentId = studentId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	

	

	
}
