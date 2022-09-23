package com.question_1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
     try {
    	 System.out.println("Enter an integer :");
    	 
    	 String s = sc.nextLine();
    	 int n = Integer.parseInt(s);
    	 System.out.println("The square value is "+n);
		
	} catch (NumberFormatException nfe) {
     
	  System.out.println("Entered input is not a valid format for an integer");
	}
     
     System.out.println("The work has been done successfully");
	}

}
