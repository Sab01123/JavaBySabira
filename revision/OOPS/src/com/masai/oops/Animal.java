package com.masai.oops;

public abstract class Animal {

	String name;
	public Animal() {
	}
	public Animal(String name) {

		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public abstract void makeNoise();
	public void sleep() {
		System.out.println("Animal is sleeping");
	}

	public abstract void eat();



}
