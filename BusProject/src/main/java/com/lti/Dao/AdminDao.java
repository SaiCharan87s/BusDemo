package com.lti.Dao;

import java.util.List;

import com.lti.model.Booking;
import com.lti.model.Bus;

public interface AdminDao {
	boolean loginUser(String username, String password);
	Bus addOrUpdateBusDetails(Bus bus);
	Booking viewBookingDetails(Booking booking);
//	Booking viewBookingDetailsById(int bookingId);
//	List<Booking> viewAllBookingDetails();
	Bus cancelBuses(int busId);

}
