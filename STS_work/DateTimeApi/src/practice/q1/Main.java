package practice.q1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		
		LocalTime lt = LocalTime.now();
		
		LocalDateTime  ldt = LocalDateTime.now();
		
		System.out.println("The current date is "+ld);
   
		System.out.println("The current time is "+lt);

		System.out.println("The current date and time is "+ldt);

		LocalDate dob = LocalDate.of(1995, 05, 16);
		System.out.println(dob);
	}

}
