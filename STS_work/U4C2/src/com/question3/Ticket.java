package com.question3;

public class Ticket {
	int ticketid;
	int price;
	static int availableTickets;

	public Ticket() {
	}
	public Ticket(int ticketid, int price) {
	super();
	this.ticketid = ticketid;
	this.price = price;
}


	public int calculateTicketCost(int noOfTickets) {
		if(availableTickets>noOfTickets) {
			availableTickets = availableTickets-noOfTickets;
		return noOfTickets*price;
		}
		
		return -1;
	}
}
