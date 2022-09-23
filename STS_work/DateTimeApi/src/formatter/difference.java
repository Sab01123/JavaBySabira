package formatter;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class difference {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("enter dob dd-MM-yyyy");
		String dob = sc.next();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate ld = LocalDate.parse(dob, dtf);
		
//		System.out.println(ld);
		
		LocalDate current = LocalDate.now();
		
		Period p = Period.between(ld, current);
		System.out.println("Difference between your date of birth to current date is "+p);
		
		
	}

}
