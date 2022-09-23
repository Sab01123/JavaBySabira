package formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your date of birth dd-MM-yyyy");
		String dob = sc.next();
		
		DateTimeFormatter formatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate ld = LocalDate.parse(dob, formatobj);
		
//		System.out.println(ld);
		
	String day = 	ld.format(DateTimeFormatter.ofPattern("EEEE"));
		
	System.out.println("Your Birthday Day is "+day);
	}

}
