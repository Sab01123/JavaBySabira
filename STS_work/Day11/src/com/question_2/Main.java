package com.question_2;

import java.io.Console;
import java.util.Scanner;

public class Main {
	
int	calculateAverage(int[] age){
	int sum = 0;
		for(int i = 0; i<age.length; i++) {
			sum += age[i];
		}
		int average = sum/age.length;
		return average;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

System.out.println("Enter number of employees");
		int noEmp = sc.nextInt();
		
		System.out.println("Enter the ages of employees");
		int []  arr = new int[noEmp];
		for(int i=0; i<noEmp; i++) {
			int ages = sc.nextInt();
			 arr[i] = ages;

		}
		
		Main main = new Main();
	int res = 	main.calculateAverage(arr);
	System.out.println(res);
		
	}

}
