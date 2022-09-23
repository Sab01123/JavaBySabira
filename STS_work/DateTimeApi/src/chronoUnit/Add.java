package chronoUnit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Add {

	public static void main(String[] args) {

//Example: Adding 3 month to the current date:
		
		//by chronoUnit
		LocalDate current = LocalDate.now();
	LocalDate months = 	ChronoUnit.MONTHS.addTo(current, 3);
		System.out.println(months);
		
		
		
		//by simple plus
		
		LocalDate current2 = LocalDate.now();
LocalDate	months2 = 	current2.plusMonths(3);
System.out.println(months2);

//another way

LocalDate current3 = LocalDate.now();

 LocalDate months3 =   current3.plus(3,ChronoUnit.MONTHS);
System.out.println(months3);
	}

}
