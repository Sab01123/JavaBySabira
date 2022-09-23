package com.java;

public class Java {

//	public static void positiveNum(int one, int two, int three, int four, int six) {
//		int sum =  (one*1+two*2+three*3+four*4+six*6);
//		System.out.println(sum);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assume these can have any value:
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 60.0;
		//print "Let’s stay home." if its raining, snowing or
		//below 50 degrees and print "Let’s go out!" otherwise.
		if(isSnowing==true) {
			System.out.println("Let's stay home.");
		}
		else if(isRaining==true) {
			System.out.println("Let's stay home.");
		}
		else if(temperature<50) {
			System.out.println("Let's stay home.");
		}
		else {
			System.out.println("Let's go out!");
		}
	}

}
