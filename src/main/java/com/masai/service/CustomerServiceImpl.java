package com.masai.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
import com.masai.exception.DriverException;
import com.masai.model.Customer;
import com.masai.model.Driver;
import com.masai.repository.CustomerDao;
import com.masai.repository.DriverDao;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private DriverDao driverDao;
	
	@Override
	public Customer register(Customer customer) {
		if(customer==null)
			throw new IllegalArgumentException("Invalid user details");
		
		return customerDao.save(customer);
	}

	@Override
	public List<Driver> findRide(Integer customerId,String fromWhere, String toWhere) throws DriverException {
	
		Optional<Customer> customer = customerDao.findById(customerId);
		
		List<Driver> result = new ArrayList<>();
		
		List<Driver> drivers = driverDao.findByDriverFromAndDriverTo(fromWhere, toWhere);

        for(Driver elem : drivers) {
			
			Integer x1= elem.getDistanceFrom();
			Integer y1 = elem.getDistanceTo();
			
			Integer x2 = customer.get().getDistanceFrom();	
			Integer y2 = customer.get().getDistanceTo();
			
			
            Double distance =  Math.sqrt( Math.pow((x2-x1),2) +  Math.pow((y2-y1),2));
            
            if(distance <= 5.00) {
            	result.add(elem);
            }       
        }
		
        if(result.size() ==0) 
        	throw new DriverException("There is no Cab availablt from "+ fromWhere +" to "+ toWhere);
		return result;
	}

	@Override
	public String bookRide(Integer driverId, Integer x, Integer y)throws DriverException, CustomerException {
		
		Optional<Driver> driver = driverDao.findById(driverId);		
		
		if( driver.isEmpty()) {
			throw new DriverException("Incorrect driverId");
		}
		
		driver.get().setDistanceFrom(x);
		driver.get().setDistanceTo(y);
		return "Ride bokked successfully";
	}

}
