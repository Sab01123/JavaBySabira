package com.question_4;

public class Student {

private	int roll;
private	String name;
private int	marks;
private	char grade;

private int  c;
 Student stu;
public void displayDetails() {
	
//stu	= new Student(roll, name, marks);
 
 char gra =  calculateGrade();
System.out.println("Grade of Student "+stu.c +" is " +gra);
//c++;
}
private char calculateGrade() {
	if(stu.marks>=500) {
		return 'A';
	}
	else if(stu.marks>=400) {
	return 'B';
}
	else if(stu.marks<400) {
		return 'C';
	}
return 0;

}

public Student() {
	// TODO Auto-generated constructor stub
}

public Student(int roll, String name, int marks, int c) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	this.c = c;
//	this.grade = grade;
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

public char getGrade() {
	return grade;
}

public void setGrade(char grade) {
	this.grade = grade;
}



}
