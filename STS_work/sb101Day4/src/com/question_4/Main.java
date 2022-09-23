package com.question_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the 2 numbers to know quotient");
			
			System.out.println("Enter first number");
			int n1 = sc.nextInt();
			
			System.out.println("Enter second number");
			int n2 = sc.nextInt();
			System.out.println("The quotient of "+n1+"/"+n2+" is "+Math.floorDiv(n1, n2));
			

		} catch (ArithmeticException e) {
System.out.println(e.getMessage());	

		}catch (Exception e) {
System.out.println("Enter a valid number");		
    }finally {
		System.out.println("Inside finally block");
	}
		
	}

}
