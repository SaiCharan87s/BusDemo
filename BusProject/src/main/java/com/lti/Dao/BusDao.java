package com.lti.Dao;

import java.util.List;

public interface BusDao {
	boolean viewBookingStatus();
	List<String> viewAllSourceLocations();
	List<String> viewAllDestinationLocations();
}
