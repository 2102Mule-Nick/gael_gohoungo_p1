package com.revature.pojo;

import java.sql.Date;

public class Hotel {

	private String hotelName;
	
	private String hotelAddress;
	
	private String roomType;
	
	private float roomPrice;
	
	private Date checkIn;
	
	private Date checkOut;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String hotelName, String hotelAddress, String roomType, float roomPrice, Date checkIn, Date checkOut) {
		super();
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public float getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(float roomPrice) {
		this.roomPrice = roomPrice;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", hotelAddress=" + hotelAddress + ", roomType=" + roomType
				+ ", roomPrice=" + roomPrice + ", checkIn=" + checkIn + ", checkOut=" + checkOut + "]";
	}
	
	
}
