package com.question_5;

public class fuelCar implements Vehicle,Services {
@Override
public void run() {
	System.out.println("fuel car is running");
}

@Override
public void services() {
	// TODO Auto-generated method stub
	System.out.println("car need services");
	
}

}
