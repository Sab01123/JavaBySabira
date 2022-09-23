package com.question_5;

public class ElectricCar implements Vehicle, Services{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("electric car is running");
	}

	@Override
	public void services() {
		System.out.println("car need services");
		
	}

	
	
}
