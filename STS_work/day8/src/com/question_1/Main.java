package com.question_1;

import java.util.Scanner;

public class Main {

	public static String reversString(String input){
	String bag="";
      for(int i=input.length()-1; i>=0; i--)
      {
    	  bag+=input.charAt(i);
      }
      return bag;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String you want to reverse");
		 String originalString =  sc.next();
		 
		String result =  reversString(originalString);
		
		System.out.println("original string is : "+originalString);
		System.out.println("Reversed string is : "+result);
	}

}
