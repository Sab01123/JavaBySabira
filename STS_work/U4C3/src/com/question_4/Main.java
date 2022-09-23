package com.question_4;

import java.util.Scanner;



public class Main {
	

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

System.out.println("Enter a String");
String nameString = sc.next();

System.out.println("Enter a position");
int p = sc.nextInt();

	while(true) {
		if(p<nameString.length()) {
			System.out.println("Character at the position" +p+ " is " +nameString.charAt(p));
			break;
		}
		System.out.println("Invalid position, Please enter a valid position");
		p=sc.nextInt();
	}
		
	}
}
