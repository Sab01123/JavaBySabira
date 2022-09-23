package com.question_1;

public class Employee {

private int	Id;
private String	Name;
private double	Salary;
public Employee() {
}
public Employee(int id, String name, double salary) {
	super();
	Id = id;
	Name = name;
	Salary = salary;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
@Override
public String toString() {
	return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
}






}
