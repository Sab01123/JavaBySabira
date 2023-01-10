package com.masai.service;

import com.masai.model.Driver;

public interface DriverService {

	public Driver registerDriver(Driver driver);
	
	public String registerDriverToCab(Integer driverId, Integer cabId);
}
