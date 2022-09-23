package formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatting {

	public static void main(String[] args) {

		DateTimeFormatter formatobj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		LocalDateTime current = LocalDateTime.now();
		
	String usercurrent	= current.format(formatobj);
		
		System.out.println("current date and time in default format is  "+current);
		System.out.println("current date and time in userdefined format is "+ usercurrent);
		
		
		
		//formating only date
		
		
		DateTimeFormatter formatobj2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate current2 = LocalDate.now();
	String usercurrent2 = 	current2.format(formatobj2);
	System.out.println("User defined date is "+ usercurrent2);
	System.out.println("current date by default is "+current2);
		
	}

}
