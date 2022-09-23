package com.question_3;

import java.util.Scanner;

public final class Child extends Parent{


	@Override
	void method1() {
		System.out.println("in Child class");
	}
	
	void method4() {
		System.out.println("in Child class");
	
}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number between 0-10");
		
		int num = sc.nextInt();
		
		if(num>0 && num<=10) {
			
			Parent parent = new Parent(num) {
				
				@Override
				void method1() {
					System.out.println(this.number);
					
					
				}
				
			};
			parent.method1();
			
			
		}
		else {
			System.out.println("Invalid Number");
		}
		

		Parent pa=new Child();
		pa.method1();
		pa.method2();
		pa.method3();
		((Child) pa).method4();
	}

	
}
