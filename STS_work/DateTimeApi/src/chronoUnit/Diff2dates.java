package chronoUnit;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Diff2dates {

	public static void main(String[] args) {


		LocalDateTime oldDate = LocalDateTime.of(1995,05,16, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.of(1997,05,16, 11, 25, 57);
		
	long years = ChronoUnit.YEARS.between(oldDate,newDate);
System.out.println(years);


long months = ChronoUnit.MONTHS.between(oldDate, newDate);

System.out.println(months);

System.out.println(ChronoUnit.YEARS.between(oldDate, newDate) + " years");
System.out.println(ChronoUnit.MONTHS.between(oldDate, newDate) + " months");
System.out.println(ChronoUnit.WEEKS.between(oldDate, newDate) + " weeks");
System.out.println(ChronoUnit.DAYS.between(oldDate, newDate)+ " days");
System.out.println(ChronoUnit.HOURS.between(oldDate, newDate) + " hours");
System.out.println(ChronoUnit.MINUTES.between(oldDate, newDate) + " minutes");
System.out.println(ChronoUnit.SECONDS.between(oldDate, newDate) + " seconds");
System.out.println(ChronoUnit.MILLIS.between(oldDate, newDate) + " milis");
System.out.println(ChronoUnit.NANOS.between(oldDate, newDate) + " nano");


	}

}
