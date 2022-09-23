package com.question_3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class AccountDemo {
	
	

	public static void main(String[] args) throws Exception{
Account d1 = new Account(Account.accountNumber, 500);
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("For depositing amount Enter 1");
	System.out.println("for withdrawing amount Enter 2");
	
	String s = sc.next();
	int n = Integer.parseInt(s);
	
	if(n==1) {
	
		try {
			System.out.println("Enter account number");
			String accNo = sc.next(); 
			System.out.println("Enter amount you want to deposite");
			double amount1 = sc.nextDouble();
			if(amount1>=0) {
				System.out.println("Account Number "+accNo);
			d1.deposit(amount1);
			System.out.println("new Balance is Rs "+ (Account.balance+amount1));
			
			}
			else {
				System.out.println("Please enter valid amount");
			}
		} catch (InputMismatchException e) {
			System.out.println("Amount should be only in numbers");
		}

		
	
	}
		else if(n==2) {
			try {
				System.out.println("Enter Account Number");
				String accNo2 = sc.next();
				System.out.println("Enter amount you want to withdraw");
				double amount2 = sc.nextDouble();
				if(amount2>0) {
					
					System.out.println("Account Number is "+accNo2);
					Double am2 =	d1.withdraw(amount2);
					System.out.println("Amount withdrawn Rs "+am2);
					System.out.println("new Account Balance is Rs "+ (Account.balance-am2));
				}
				else {
					System.out.println("Please enter amount greater than 0");
				}
			} catch (InsufficientFundException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}catch(InputMismatchException ex) {
				System.out.println("Amount should be only in numbers");
			}
		}
	
		else {
			System.out.println("Please enter valid number");
		}
	System.out.println("Thank You");
		
	
	}

}
