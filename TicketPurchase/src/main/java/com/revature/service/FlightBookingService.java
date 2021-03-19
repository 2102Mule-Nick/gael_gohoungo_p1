package com.revature.service;

import com.revature.exception.NoFlightFound;
import com.revature.pojo.FlightBooking;

public interface FlightBookingService {

	public String bookFlight(String flightNumber) throws NoFlightFound;
	
	public void cancelFlight(FlightBooking flightNumber);
	
	public FlightBooking updateFlight(FlightBooking flightUpdate);
	
	public float flightPrice(FlightBooking flightPrice);



}
