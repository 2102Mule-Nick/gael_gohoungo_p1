package com.revature.dao;

import com.revature.exception.NoFlightFound;
import com.revature.pojo.FlightBooking;

public interface FlightBookingDao {

	public FlightBooking bookFlight(String flightNumber) throws NoFlightFound;
	
	public float flightPrice(FlightBooking flightPrice);
	
	public FlightBooking updateFlight(FlightBooking flightUpdate);
	
	public void cancelFlight(FlightBooking flightNumber);
}
