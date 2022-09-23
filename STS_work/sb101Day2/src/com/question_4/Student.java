package com.question_4;

import java.util.Objects;

public class Student implements Comparable<Student> {

private	int roll;
private	String name;
private	int marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(marks);
//	}

	@Override
	public int compareTo(Student o) {
	return o.getMarks()>this.getMarks() ? +1:-1;
	}

//	@Override
//	public boolean equals(Object obj) {
//		Student s1 = this;
//		Student s2 = (Student) obj;
//		if(s1.getMarks()>s2.getMarks())
//			return true;
////		else if(s1.getMarks()<s2.getMarks())
////			return false;
//		else return false;
//	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(marks);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return marks == other.marks;
//	}

//	@Override
//	public int compareTo(Student o) {
//		Student s1 = this;
//		Student s2 = (Student) o;
//		
//		if(s1.getMarks()>s2.getMarks())
//			return +1;
//		else if(s1.getMarks()<s2.getMarks())
//			return -1;
//		else return 0;
//	}

	
	
	
}
