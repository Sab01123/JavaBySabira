package com.question_3;

public class Main {

	
	
	public static void main(String[] args) {

		Loan obj  = new Loan();

		double perc2  = obj.calculateLoanAmount(new PermanentEmployee(2, "Farooq", 1000));
		System.out.println("Loan Amount for Permanent Employee => "+perc2);
		
		double perc = obj.calculateLoanAmount(new TemporaryEmployee(1, "Sabira", 20, 100));
		System.out.println("Loan Amount for Temporary Employee => "+perc);
		
	}

}
