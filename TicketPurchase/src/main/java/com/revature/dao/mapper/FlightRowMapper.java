package com.revature.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.revature.pojo.FlightBooking;

@Component
public class FlightRowMapper implements RowMapper<FlightBooking> {
	
	private FlightExtractor flightExtractor;
	
    @Autowired
	public void setFlightExtractor(FlightExtractor flightExtractor) {
		this.flightExtractor = flightExtractor;
	}


	@Override
	public FlightBooking mapRow(ResultSet rs, int rowNum) throws SQLException {
		return flightExtractor.extractData(rs);
	}

}
