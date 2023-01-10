package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CustomerException;
import com.masai.exception.DriverException;
import com.masai.model.Customer;
import com.masai.model.Driver;
import com.masai.service.CustomerServiceImpl;

@RestController
@RequestMapping("/masaicab")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;

	@PostMapping("/user/register")
	public ResponseEntity<Customer> registerHandler( @RequestBody Customer customer){
		
		Customer register = customerServiceImpl.register(customer);
		
		return new ResponseEntity<Customer>(register, HttpStatus.CREATED);
	}
	
	@GetMapping("/user/findride")
	public ResponseEntity<List<Driver>> findRideHandler(@RequestParam(value = "cId") Integer customerId,@RequestParam(value = "from") String fromWhere,@RequestParam(value = "to")  String toWhere) throws DriverException{
		
		List<Driver> findRide = customerServiceImpl.findRide(customerId, fromWhere, toWhere);
		
		return new ResponseEntity<List<Driver>>(findRide, HttpStatus.OK);
	}
	
	@GetMapping("/user/book/{driverId}/{x}/{y}")
	public ResponseEntity<String> bookRideHandler(@PathVariable("driverId") Integer driverId,@PathVariable("") Integer x,@PathVariable("") Integer y) throws DriverException, CustomerException{
		
		
		String bookRide = customerServiceImpl.bookRide(driverId, x, y);
		
		return new ResponseEntity<String>(bookRide, HttpStatus.OK);
	}
}
