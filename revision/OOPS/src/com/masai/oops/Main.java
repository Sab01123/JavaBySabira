package com.masai.oops;

public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		animal1.makeNoise();
		animal1.eat();
		animal1.sleep();
	     Cat c =(Cat)animal1;
	     c.jump();
		
		animal2.makeNoise();
		animal2.eat();
		animal2.sleep();
		Dog d = (Dog)animal2;
		d.play();
		
	}

}
