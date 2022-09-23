package com.question_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
//		car.companyName = "Tata";
//		car.Color = "pink";
//		car.model="E5";
//		car.engine.manufacturer="tata";
//		car.engine.Power=110;
//		car.engine.rmp=100000;
//		car.engine.enableTurbo();
//		
//		System.out.println("Color is "+ car.Color);
		Engine e= new Engine(3,2,"j",true);
		Car car2=new Car("w","sdfghjk","dfgh",e);
		
//		System.out.println("Car companyName is "+car2.companyName);
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter name ");
		String name =scanner.nextLine();
		System.out.println("Enter index value");
	
		for(int i=0; i<name.length(); i++) {
		  if(i==scanner.nextInt()) {
			  System.out.println(name[i]);
		  }
		}
		}

}
