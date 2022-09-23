package com.question_1;

import java.util.Scanner;

public class Main {
	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number of Passengers");
	int nopas = sc.nextInt();
	
	System.out.println("Enter number of Kms ");
	int noKms = sc.nextInt();
	
	OLA myOla = new OLA();
	Car myCar = myOla.bookCar(nopas, noKms);
	int res = myOla.calculateBill(myCar);
	System.out.print(res);
	
}

}
