package com.lti.Dao;

import com.lti.model.Bus;
import com.lti.model.Passenger;
import com.lti.model.Ticket;

public interface TicketDao {
	Ticket addTicketDetails(Ticket ticket);
	Bus updateStatus(int ticketId);
	Passenger fetchPassengerDetails(int ticketId);
	Bus fetchBusDetails(int ticketId);

}
