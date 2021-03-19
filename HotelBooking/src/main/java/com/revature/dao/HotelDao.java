package com.revature.dao;

import com.revature.exception.HotelNotFound;
import com.revature.pojo.Hotel;

public interface HotelDao {

	public Hotel hotelInfo(Hotel hotel) throws HotelNotFound;
}
