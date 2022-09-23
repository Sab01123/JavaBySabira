package com.question_4;

public class Bank {

	  private Bank(){
	      System.out. println("Inside private constructor of Bank");
	   }

	 static Bank show() {
		  Bank bank = new Bank();
		  return bank;
	  }
}
