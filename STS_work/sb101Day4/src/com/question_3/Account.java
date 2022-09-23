package com.question_3;

public class Account {

    static	String accountNumber;
	 static double balance;
	 
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String accountNumber, double balance ) {
    
		super();
	Account.accountNumber =accountNumber;
	Account.balance = balance;
	
	}
	
	public static void deposit(Double amount) {
		System.out.println("Amount is deposited Sussefully");
	}
	
	public static double withdraw(Double amount) throws InsufficientFundException{
		double output = 0;
		if(balance >= amount) {
			output=amount;
		}else {
			InsufficientFundException inf = new InsufficientFundException("Amount for withdrawing should be less or equal to balance available");
			throw inf;
		}
		return output;
	}
	
	
	
	
}
