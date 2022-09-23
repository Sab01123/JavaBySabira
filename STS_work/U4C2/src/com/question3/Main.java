package com.question3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no of bookings:");
		int nob = scanner.nextInt();
		int c = 1;
		while(true) {
			c++;
			Ticket obj = new Ticket();
			
		
		System.out.println("Enter the available tickets:");
		int noa = scanner.nextInt();
		obj.availableTickets = noa;
		
		System.out.println("Enter the ticketid:");
		int ticId = scanner.nextInt();
		
		System.out.println("Enter the price:");
		int price = scanner.nextInt();
		obj.price = price;

		System.out.println("Enter the no of tickets:");
		int noT = scanner.nextInt();
		
		System.out.println("Available tickets:");
		System.out.println(noa);
		int totalA = obj.calculateTicketCost(noT);
System.out.println("total amount "+totalA);
System.out.println("Available ticket after booking :"+obj.availableTickets);
		if(c>nob) {
			break;
		}
		}
	}

}
