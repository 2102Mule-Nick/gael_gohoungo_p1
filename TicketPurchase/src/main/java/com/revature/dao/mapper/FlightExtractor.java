package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.revature.pojo.FlightBooking;

public class FlightExtractor implements ResultSetExtractor<FlightBooking> {

	@Override
	public FlightBooking extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		FlightBooking newFlight = new FlightBooking();
		
		newFlight.setArrivalCity(rs.getString("arrival_city"));
		newFlight.setDepartureCity(rs.getString("departure_city"));
		newFlight.setArrivalDate(rs.getDate("arrival_date"));
		newFlight.setDepartureDate(rs.getDate("departure_date"));
		newFlight.setFlightNumber(rs.getInt("flight_number"));
		newFlight.setFlightPrice(rs.getFloat("flight_price"));
		newFlight.setNumberOfPassenger(rs.getInt("number_of_passengers"));
		newFlight.setOneWay(rs.getBoolean("one_way"));
		newFlight.setRoundTrip(rs.getBoolean("round_trip"));
		newFlight.setBusinessClass(rs.getBoolean("business_class"));
		newFlight.setEconomyClass(rs.getBoolean("economy_class"));
		
		return newFlight;
	}

}
