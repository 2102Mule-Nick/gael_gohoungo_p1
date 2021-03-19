package com.revature.service;

import com.revature.exception.AirportNotFound;
import com.revature.pojo.Airports;

public interface AirportService {

	public Airports airportInfos(Airports airport) throws AirportNotFound;
}
