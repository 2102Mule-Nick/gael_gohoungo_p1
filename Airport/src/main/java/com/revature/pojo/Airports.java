package com.revature.pojo;

public class Airports {

	private String airportName;
	
	private String airportAddress;

	public Airports() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airports(String airportName, String airportAddress) {
		super();
		this.airportName = airportName;
		this.airportAddress = airportAddress;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportAddress() {
		return airportAddress;
	}

	public void setAirportAddress(String airportAddress) {
		this.airportAddress = airportAddress;
	}

	@Override
	public String toString() {
		return "Airports [airportName=" + airportName + ", airportAddress=" + airportAddress + "]";
	}
	
	
}
