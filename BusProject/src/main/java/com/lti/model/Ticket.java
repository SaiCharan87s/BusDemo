package com.lti.model;

public class Ticket {
	
	int ticketId;
	int seatNumber;
	
	public Ticket() {
		
	}

	public Ticket(int ticketId, int seatNumber) {
		this.ticketId = ticketId;
		this.seatNumber = seatNumber;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

}
