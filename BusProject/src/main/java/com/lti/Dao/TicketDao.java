package com.lti.Dao;

import com.lti.model.Bus;
import com.lti.model.Passenger;
import com.lti.model.Ticket;

public interface TicketDao {
	Ticket addTicketDetails(Ticket ticket);
	boolean updateStatus();
	Passenger fetchPassengerDetails(Passenger passenger);
	Bus fetchBusDetails(Bus bus);

}
