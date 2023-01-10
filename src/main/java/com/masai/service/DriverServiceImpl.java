package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Cab;
import com.masai.model.Driver;
import com.masai.repository.CabDao;
import com.masai.repository.CustomerDao;
import com.masai.repository.DriverDao;

@Service
public class DriverServiceImpl implements DriverService{

	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private DriverDao driverDao;
	
	@Autowired
	
	private CabDao cabDao;
	
	@Override
	public Driver registerDriver(Driver driver) {
		if(driver == null) {
			throw new IllegalArgumentException("Invalid driver details");
		}
		return driverDao.save(driver);
	}

	@Override
	public String registerDriverToCab(Integer driverId, Integer cabId) {
		
		Optional<Driver> driver = driverDao.findById(driverId);
		
		if(driver.isEmpty()){ 
			throw new IllegalArgumentException("Driver doesn't exist with driverId : "+ driverId);
		}
		
		Optional<Cab> cab = cabDao.findById(cabId);
		
		if(cab.isEmpty()) {
			throw new IllegalArgumentException("Cab doesn't exist with cabId : "+ cabId);
		}
		
		driver.get().setCab(cab.get());
		
		cab.get().setDriver(driver.get());		
		
		return "Cab allotted to Driver successfully";
	}
		


	
}
