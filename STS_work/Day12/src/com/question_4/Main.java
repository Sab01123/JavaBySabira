package com.question_4;

import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {

	  

		Test t1 = new Test();
		
Scanner sc1 = new Scanner(System.in);	
		System.out.println("Enter a number");
		int n = sc1.nextInt();
		
int[] array	= t1.display(n);

for(int i = 2; i<array.length; i++) {
	if(array[i] !=0) {
		System.out.print(array[i]+" ");
	}
}

	}

}
