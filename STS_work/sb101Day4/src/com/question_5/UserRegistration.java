package com.question_5;

public class UserRegistration {
	
	String username;
	String userCountry;

	public static void registerUser(String username, String userCountry) throws InvalidCountryException{
		
		if(userCountry.equalsIgnoreCase("india")) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ie = new InvalidCountryException("User Outside India cannot be registered");
			throw ie;
		}
	
		
	}
	
}
