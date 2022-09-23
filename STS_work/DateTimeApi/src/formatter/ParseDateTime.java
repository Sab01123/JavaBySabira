package formatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDateTime {

	public static void main(String[] args) {

String dob = "16-05-1995";

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

LocalDate ld = LocalDate.parse(dob, dtf);

System.out.println(ld);

//add one year

// LocalDate afterAdd =   ld.plusYears(1);
// System.out.println(afterAdd);


//day of birth

//String day =  ld.format(DateTimeFormatter.ofPattern("EEEE"));
//System.out.println(day);
	}

}
