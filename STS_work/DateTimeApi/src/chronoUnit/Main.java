package chronoUnit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*Write an application, in which user will be prompted to enter startDate and endDate
in the form of String in “dd-MM-yyyy” pattern.
If the startDate is greater than end date, show the message to the user as :
“Start date should be smaller than End date”
if user passes the wrong date pattern then show the message to the user as:
“Please enter date in dd-MM-yyyy” format”
otherwise calculate the number of days and between start date and end date.
calculate and print the total wages (wages for 1 day is 1200).
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Date in dd-MM-yyyy");
		String start = sc.next();
		System.out.println("Enter End Date in dd-MM-yyyy");
		String end = sc.next();
		
		try {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			LocalDate startDate = LocalDate.parse(start, dtf);
			LocalDate endDate = LocalDate.parse(end, dtf);
			
//			ChronoUnit.DAYS.between(startDate, endDate);
	 int startmo = startDate.getMonthValue();	
	 int endmo = endDate.getMonthValue();
			if(startDate.isAfter(endDate)) {
				System.out.println("Start date should be smaller than End date");
			}
			else {
				Long diffLong = 	ChronoUnit.DAYS.between(startDate, endDate);
//				Period p = Period.between(startDate, endDate);
				System.out.println("Number of days  between start date and end date are "+diffLong);
//			System.out.println(diffLong);
		System.out.println("Total wages are " + diffLong*1200);
			}
			
		} catch (Exception e) {
System.out.println("Please enter date in dd-MM-yyyy format");		}
	

		
	}

}
