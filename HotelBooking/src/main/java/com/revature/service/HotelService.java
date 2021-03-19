package com.revature.service;

import com.revature.exception.HotelNotFound;
import com.revature.pojo.Hotel;

public interface HotelService {

	public Hotel hotelInfo(Hotel hotel) throws HotelNotFound;
}
