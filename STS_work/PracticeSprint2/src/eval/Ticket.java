package eval;

import java.util.Scanner;

public class Ticket {
	int ticketid;
	int price;
	
	static int availableTickets;
	
	public   int calculateTicketCost(int nooftickets) {
		
		if((nooftickets)<=availableTickets) {
			
			availableTickets=availableTickets-nooftickets;
			return (nooftickets*price);
			
		}else {
			return -1;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		
		Ticket dataTicket= new Ticket();
		
		Scanner sc =new Scanner(System.in);
		
//		dataTicket.ticketid
		
		
		System.out.println("Enter Ticket id");
		dataTicket.ticketid=sc.nextInt();
		
		System.out.println("Enter a price of ticket");
		dataTicket.price=sc.nextInt();
		
		System.out.println("Enter Ticket availability");
		availableTickets=sc.nextInt();
		
		
		System.out.println("Enter no of bookings");
		int nooftickets =sc.nextInt();
		
		
		System.out.println(dataTicket.calculateTicketCost(nooftickets));
			
		
	}

}
