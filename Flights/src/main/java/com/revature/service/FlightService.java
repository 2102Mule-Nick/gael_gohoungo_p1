package com.revature.service;

import com.revature.exception.FlightNotFound;
import com.revature.pojo.Flights;

public interface FlightService {

	public Flights flightInfo(Flights flight) throws FlightNotFound;
	
}
