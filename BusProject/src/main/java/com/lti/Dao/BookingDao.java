package com.lti.Dao;


import com.lti.model.Bus;

public interface BookingDao {
	public void addBookingwithExistingBus(Bus bus);
	public int viewAvailableSeats(int busId);
	public int viewNoOfSeatsBooked(int busId);

}
