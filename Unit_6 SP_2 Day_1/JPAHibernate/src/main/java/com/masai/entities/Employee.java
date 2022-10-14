package com.masai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)  
  private int empId;

@Column(nullable = false)
  private String name;

@Column(nullable = false)
  private String address;

@Column(nullable = false)
  private int salary;
  
public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(String name, String address, int salary) {
	super();
	this.name = name;
	this.address = address;
	this.salary = salary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}


}
