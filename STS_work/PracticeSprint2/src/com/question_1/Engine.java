package com.question_1;


public class Engine {
	int rmp;
	int Power;
	String manufacturer;
	boolean hasTurbo;
	public boolean enableTurbo() {
		this.hasTurbo = true;
		return hasTurbo;
	}
	public Engine() {
	}
	public Engine(int rmp, int power, String manufacturer,boolean hasTurbo) {
		super();
		this.rmp = rmp;
		Power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = hasTurbo;
	}
	
}
