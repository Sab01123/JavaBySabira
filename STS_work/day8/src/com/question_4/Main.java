package com.question_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c=0;
		System.out.println("Enter number");
		 String num =  sc.nextLine();
		 for(int i=0; i<num.length(); i++) {
		if(num.charAt(i)==' ') {
			c++;	
		}
		
		 }
//		System.out.println("c"+c);
		 int mul=1;
		 int q=0;
		 int m=0;
		 if(c==0) {
			 for(int i=1;i<=Integer.parseInt(num);i++) {
				 
				 mul=mul*i;
				 
			 }
			 System.out.println(mul);
		 }
		 else if(c==1) {
			
			 for(int i=0;i<num.length();i++) {
				 if(num.charAt(i)!=' ') {
					 if(i==0) {
				   q= Character.getNumericValue(num.charAt(i));
					 }
					 else {
						  m=Character.getNumericValue(num.charAt(i));
					 }
//			System.out.println("q"+q);
//			System.out.println("m"+m);
				 }
			 
 for(int j=1;j<= Math.abs(q-m);j++) {
				 
				 mul=mul*j;
				 
			 }
			 System.out.println(mul);
			 }
		 }
		 else {
			 System.out.println("error");
		 }
	}

}
