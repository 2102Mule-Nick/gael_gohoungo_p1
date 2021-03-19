package com.revature.pojo;

import java.sql.Date;

public class Flights {
	
	private String companyName;

	private int flightNumber;
	
	private String type;
	
	private Date flightDate;
	
	private String flightTime;
	
	private String departure;
	
	private String arrival;

	public Flights() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flights(String companyName, int flightNumber, String type, Date flightDate, String flightTime,
			String departure, String arrival) {
		super();
		this.companyName = companyName;
		this.flightNumber = flightNumber;
		this.type = type;
		this.flightDate = flightDate;
		this.flightTime = flightTime;
		this.departure = departure;
		this.arrival = arrival;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	@Override
	public String toString() {
		return "Flights [companyName=" + companyName + ", flightNumber=" + flightNumber + ", type=" + type
				+ ", flightDate=" + flightDate + ", flightTime=" + flightTime + ", departure=" + departure
				+ ", arrival=" + arrival + "]";
	}
	
	
}
