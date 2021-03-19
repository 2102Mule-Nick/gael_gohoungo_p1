package com.revature.dao;

import com.revature.exception.FlightNotFound;
import com.revature.pojo.Flights;

public interface FlightDao {

	public Flights fightInfo(Flights flight) throws FlightNotFound;
}
