package com.revature.pojo;

import java.sql.Date;

public class FlightBooking {
	
	private int flightNumber;
	
	private String departureCity;
	
	private String arrivalCity;
	
	private boolean oneWay;
	
	private boolean roundTrip;
	
	private Date departureDate;
	
	private Date arrivalDate;
	
	private int numberOfPassenger;
	
	private boolean economyClass;
	
	private boolean businessClass;
	
	private float flightPrice;

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public boolean isOneWay() {
		return oneWay;
	}

	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}

	public boolean isRoundTrip() {
		return roundTrip;
	}

	public void setRoundTrip(boolean roundTrip) {
		this.roundTrip = roundTrip;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	public boolean isEconomyClass() {
		return economyClass;
	}

	public void setEconomyClass(boolean economyClass) {
		this.economyClass = economyClass;
	}

	public boolean isBusinessClass() {
		return businessClass;
	}

	public void setBusinessClass(boolean businessClass) {
		this.businessClass = businessClass;
	}

	public float getFlightPrice() {
		return flightPrice;
	}

	public void setFlightPrice(float flightPrice) {
		this.flightPrice = flightPrice;
	}

	public FlightBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightBooking(int flightNumber, String departureCity, String arrivalCity, boolean oneWay, boolean roundTrip,
			Date departureDate, Date arrivalDate, int numberOfPassenger, boolean economyClass, boolean businessClass,
			float flightPrice) {
		super();
		this.flightNumber = flightNumber;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.oneWay = oneWay;
		this.roundTrip = roundTrip;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.numberOfPassenger = numberOfPassenger;
		this.economyClass = economyClass;
		this.businessClass = businessClass;
		this.flightPrice = flightPrice;
	}

	@Override
	public String toString() {
		return "FlightBooking [flightNumber=" + flightNumber + ", departureCity=" + departureCity + ", arrivalCity="
				+ arrivalCity + ", oneWay=" + oneWay + ", roundTrip=" + roundTrip + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", numberOfPassenger=" + numberOfPassenger + ", economyClass="
				+ economyClass + ", businessClass=" + businessClass + ", flightPrice=" + flightPrice + "]";
	}


}
