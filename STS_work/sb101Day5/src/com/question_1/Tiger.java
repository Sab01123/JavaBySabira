package com.question_1;

public class Tiger extends Animal{

	public Tiger() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	void eat() {
System.out.println("Tiger is eating !!");		
	}
	
	
	public static void main(String[] args) {
		
		Animal a1 = null;
		try {
			a1 = new Tiger();
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			a1.eat();
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
