package com.question_2;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
		Hotel hotel = null;
		if(amount>1000) {
			hotel =  new TajHotel();
		}
		else if(amount>200 && amount<1000) {
			hotel = new RoadSideHotel();
		}
		return hotel;
	}

	
	public static void main(String[] args) {

		Demo d1 = new Demo();
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Amount");
	int am = sc.nextInt();
	
	while(true) {
		if(am>200) {
			
		Hotel h1 = d1.provideFood(am);
		
		if(h1 instanceof TajHotel) {
			
			TajHotel taj = (TajHotel)h1;
			taj.chickenBiryani();
			taj.masalaDosa();
			taj.welcomeDrink();
		}
		else if (h1 instanceof RoadSideHotel){
			
			RoadSideHotel rh = (RoadSideHotel)h1;
			rh.chickenBiryani();
			rh.masalaDosa();
			
			
		}
			break;
		}
		else {
			System.out.println("Please Enter a valid amount");
			am = sc.nextInt();
		}
	}
		
	}

}
