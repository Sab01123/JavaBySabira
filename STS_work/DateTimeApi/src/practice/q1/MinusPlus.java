package practice.q1;

import java.time.LocalDate;

public class MinusPlus {

	public static void main(String[] args) {

//		LocalDate dob = LocalDate.of(1995, 05, 16);
//		System.out.println(dob);
		
		
		
		LocalDate ld = LocalDate.now();
		
		LocalDate yesterday = ld.minusDays(1);
		
		LocalDate tom = yesterday.plusDays(2);
		
		System.out.println("Today is "+ld);
		
		System.out.println("yesterday was "+yesterday);

		System.out.println("Tomarrow is "+tom);

		
		
		
		
	}

}
