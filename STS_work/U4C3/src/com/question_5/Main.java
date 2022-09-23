package com.question_5;

public class Main {
	
	

	public static void main(String[] args) {
 
		fuelCar f = new fuelCar();
		f.run();
		f.services();
		
		ElectricCar electricCar  = new ElectricCar();
		electricCar.run();
		electricCar.services();
		
	}

}
