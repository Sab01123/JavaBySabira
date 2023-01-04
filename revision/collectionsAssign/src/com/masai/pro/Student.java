package com.masai.pro;

public class Student {

	private int id;
	private String name;
	private int marks;
	private String section;
	private Address address;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int marks, String section, Address address) {
		super();
		this.name = name;
		this.marks = marks;
		this.section = section;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", section=" + section + ", address="
				+ address + "]";
	}
	
	
	
	
	

}
