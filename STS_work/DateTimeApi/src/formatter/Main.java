package formatter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your dob dd-MM-yyyy");
		String age = sc.next();
		
		
		try {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			LocalDate dob = LocalDate.parse(age, dtf);
			
			LocalDate current = LocalDate.now();
			
			Period diff = Period.between(dob, current);
//			System.out.println(diff);
		int years = diff.getYears();
//		System.out.println(years);
			
			if(years>=18) {
				System.out.println("Your age is "+years+" years You are Eligible to Vote.");

			}
			else {
				System.out.println("Sorry Your age is "+years+" years You are Not Eligible to Vote.");
				
			}
				
		} catch (Exception e) {
System.out.println("enter valid age");
		}
		
	 
	
	}

}
