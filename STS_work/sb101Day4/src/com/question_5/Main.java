package com.question_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InvalidCountryException {

		UserRegistration d1 = new UserRegistration();
		
		
		Scanner sc = new Scanner(System.in);
		
		
while(true) {
	try {
		System.out.println("Enter Your Name:");
		String name = sc.next();
		System.out.println("Enter Your Country");
		String country = sc.next();
		d1.registerUser(name, country);
		
	} catch (Exception e) {
System.out.println(e.getMessage());
}
	System.out.println("Do you want to add more Y or N");
	String noString = sc.next();
	if(noString.equalsIgnoreCase("n")) {
		break;
	}
	
}
		System.out.println("Thank you!");
	}

}
