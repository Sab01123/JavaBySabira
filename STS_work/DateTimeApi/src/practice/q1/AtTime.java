package practice.q1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AtTime {

	public static void main(String[] args) {


		LocalDate ld1 = LocalDate.of(2017, 01, 13);
//		System.out.println(ld1);
		
		LocalDateTime ldt = ld1.atTime(1,50,9);
		
		System.out.println(ldt);
	}

}
