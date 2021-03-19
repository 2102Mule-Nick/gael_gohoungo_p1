package com.revature.Dao;

import com.revature.exception.AirportNotFound;
import com.revature.pojo.Airports;

public interface AirportDao {

	public Airports airportInfos(Airports airport) throws AirportNotFound;
}
