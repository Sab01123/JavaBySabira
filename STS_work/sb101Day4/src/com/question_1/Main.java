package com.question_1;

import java.util.Scanner;

public class Main {
	
	public static int fun1(int str) {		
		
		int n = 0;
		
		if(n==0) {
			n= str*str;
		}
		
		else {
			NumberFormatException n1 = new NumberFormatException("Entered input is not a valid format for an integer.");
			throw n1;
		}
		
		return n;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
	try {
		System.out.println("Enter the Number");
		String s1 = sc.next();
		int n = Integer.parseInt(s1);
	     int result = fun1(n);
	     System.out.println("The square value is "+result);
	}catch(NumberFormatException nfe) {
		System.out.println(nfe.getMessage());
	}catch (Exception e) {
System.out.println(e.getMessage());	}
			
	System.out.println("The work has been done successfully");
		
	}

}
