package com.question_3;

public class Student {


private	int	rollNo;
private String	name;
private int	mathsMarks;
private int	scienceMarks;
private int	engMarks;

public Student() {
	// TODO Auto-generated constructor stub
}

public Student(int rollNo, String name, int mathsMarks, int scienceMarks, int engMarks) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.mathsMarks = mathsMarks;
	this.scienceMarks = scienceMarks;
	this.engMarks = engMarks;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMathsMarks() {
	return mathsMarks;
}

public void setMathsMarks(int mathsMarks) {
	this.mathsMarks = mathsMarks;
}

public int getScienceMarks() {
	return scienceMarks;
}

public void setScienceMarks(int scienceMarks) {
	this.scienceMarks = scienceMarks;
}

public int getEngMarks() {
	return engMarks;
}

public void setEngMarks(int engMarks) {
	this.engMarks = engMarks;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", mathsMarks=" + mathsMarks + ", scienceMarks="
			+ scienceMarks + ", engMarks=" + engMarks + "]";
}


}
