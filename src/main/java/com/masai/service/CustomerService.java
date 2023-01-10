package com.masai.service;

import java.util.List;

import com.masai.exception.CustomerException;
import com.masai.exception.DriverException;
import com.masai.model.Customer;
import com.masai.model.Driver;

public interface CustomerService {
	
	public Customer register(Customer customer);

	public List<Driver> findRide(Integer customerId,String fromWhere, String toWhere) throws DriverException;
	
	public String bookRide(Integer driverId, Integer x, Integer y)throws DriverException, CustomerException;
}
