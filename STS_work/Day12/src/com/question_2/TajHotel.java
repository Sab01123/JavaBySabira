package com.question_2;

public class TajHotel implements Hotel{

	@Override
	public void chickenBiryani() {
System.out.println("chickenBiryani from Taj Hotel");		
	}

	@Override
	public void masalaDosa() {
System.out.println("Masala Dosa from Taj Hotel");		
	}

	//sepicific method
	public void welcomeDrink(){
		System.out.println("Welcome Drink from the TajHotel");
		}

}
