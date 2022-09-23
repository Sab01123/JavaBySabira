package com.question_1;

public class Car {
private int numberOfPassengers;
private int numberOfKms;

public Car() {
	// TODO Auto-generated constructor stub
}

public Car(int numberOfPassengers, int numberOfKms) {
	super();
	this.numberOfPassengers = numberOfPassengers;
	this.numberOfKms = numberOfKms;
}


public int getNumberOfPassengers() {
	return numberOfPassengers;
}

public void setNumberOfPassengers(int numberOfPassengers) {
	this.numberOfPassengers = numberOfPassengers;
}

public int getNumberOfKms() {
	return numberOfKms;
}

public void setNumberOfKms(int numberOfKms) {
	this.numberOfKms = numberOfKms;
}

@Override
public String toString() {
	return "Car [numberOfPassengers=" + numberOfPassengers + ", numberOfKms=" + numberOfKms + "]";
}


}
