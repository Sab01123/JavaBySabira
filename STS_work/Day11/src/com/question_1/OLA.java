package com.question_1;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if(numberOfPassenger<=3) {
			HatchBack hat = new HatchBack();
			hat.setNumberOfKms(numberOfKMs);
			
			hat.setNumberOfPassengers(numberOfPassenger);
		
			return hat;
		}
		else {
			
         Sedan c = new Sedan();
			c.setNumberOfKms(numberOfKMs);
		     c.setNumberOfPassengers(numberOfPassenger);
			return c;
			
		}
		}
	public int calculateBill(Car car) {

		if (car instanceof HatchBack) {
			HatchBack hatch = (HatchBack)car;
		int numberOfKms = 	hatch.getNumberOfKms();
	   int farePerKm = 	hatch.farePerKm;
	   int totalFare = numberOfKms*farePerKm;
		 System.out.println("HatchBack fair per Km is "+farePerKm);
System.out.println("HatchBeck total fare is ");
	   return totalFare;
		
		}
		else {
			 Sedan c2 = (Sedan) car;
			 c2.getNumberOfKms();
		int farePerKm =	c2.farePerKm;
		int numberOfKms =	c2.getNumberOfKms();
			   int totalFare = numberOfKms*farePerKm;
			 System.out.println("Sedan fair per Km is "+farePerKm);
			 System.out.println("Sedan total fare is ");

			   return totalFare;
		}
	}
}
