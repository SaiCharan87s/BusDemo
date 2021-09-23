package com.lti.model;

import java.time.LocalTime;

public class Bus {
	int busId;
	String source;
	String destination;
	int numberOfSeats;
	double fare;
	String travelAgency;
	LocalTime startTime;
	LocalTime endTime;
	
	public Bus() {
		
	}

	public Bus(int busId, String source, String destination, int numberOfSeats, double fare, String travelAgency,
			LocalTime startTime, LocalTime endTime) {
		this.busId = busId;
		this.source = source;
		this.destination = destination;
		this.numberOfSeats = numberOfSeats;
		this.fare = fare;
		this.travelAgency = travelAgency;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getTravelAgency() {
		return travelAgency;
	}
	public void setTravelAgency(String travelAgency) {
		this.travelAgency = travelAgency;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	
}
