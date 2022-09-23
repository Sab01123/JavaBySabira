package practice.q1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Demo {

	public static void main(String[] args) {

		LocalDate lDate = LocalDate.now();
		System.out.println(lDate);
		
		LocalTime lTime = LocalTime.now();
		System.out.println(lTime);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
	}

}
