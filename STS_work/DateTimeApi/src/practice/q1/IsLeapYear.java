package practice.q1;

import java.time.LocalDate;

public class IsLeapYear {

	public static void main(String[] args) {

		LocalDate ld1 = LocalDate.of(2017, 1, 13);
		
		LocalDate ld2 = LocalDate.of(2016, 9, 23);
		
//		System.out.println("2017 leap year "+ ld1.isLeapYear());
//		System.out.println("2016 leap year "+ ld2.isLeapYear());

	boolean one = 	ld1.isLeapYear();
	boolean two = 	ld2.isLeapYear();
	
	if(one == true) {
		System.out.println("2017 is a leap year");
	}
	else {
		System.out.println("2017 is not a leap year");
	}
	
	if(two == true) {
		System.out.println("2016 is a leap year");
	}
	else {
		System.out.println("2016 is not a leap year");
	}
	}

}
