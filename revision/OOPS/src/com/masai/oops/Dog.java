package com.masai.oops;

public class Dog extends Animal{


	String breed;
	public Dog() {
	}

	public Dog(String breed) {
		super();
		this.breed = breed;
	}

	//	constructor initializing field of this + name of super class
	public Dog(String breed,String name) {
		super(name);
		this.breed = breed;

	}


	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public void makeNoise() {
		System.out.println("Dog is making noise");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");

	}
	public void	play() {
		System.out.println("Dog is playing");
	}
}
