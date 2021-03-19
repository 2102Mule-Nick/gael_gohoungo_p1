package com.revature.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.revature.dao.mapper.FlightRowMapper;
import com.revature.exception.NoFlightFound;
import com.revature.pojo.FlightBooking;

@Repository
public class FlightBookingJDBCTemplate implements FlightBookingDao {
	
	private JdbcTemplate jdbcTemplate;
	
	private FlightRowMapper flightRowMapper;
	
	@Autowired
	public void setFlightRowMapper(FlightRowMapper flightRowMapper) {
		this.flightRowMapper = flightRowMapper;
	}
    
	@Autowired
	public void setJdbbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public FlightBooking bookFlight(String flightNumber) throws NoFlightFound {
		
		String sql = "select * from flight_booking were flight_number = ?";
		
		List<FlightBooking> flight = jdbcTemplate.query(sql, flightRowMapper, flightNumber);
		return flight.get(0);
		
		
	}

	@Override
	public float flightPrice(FlightBooking flightPrice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FlightBooking updateFlight(FlightBooking flightUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelFlight(FlightBooking flightNumber) {
		// TODO Auto-generated method stub
		
	}

}
