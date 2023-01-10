package com.masai.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.masai.model.Driver;
import com.masai.service.DriverServiceImpl;

@RestController
@RequestMapping("/masaicab")
public class DriverController {

	@Autowired
	private DriverServiceImpl driverServiceImpl;

	@PostMapping("/driver/register")
	public ResponseEntity<Driver> registerHandler(@RequestBody Driver driver){

		Driver registerDriver = driverServiceImpl.registerDriver(driver);

		return new ResponseEntity<Driver>(registerDriver, HttpStatus.CREATED);
	}
	@GetMapping("/driver/register")
	public ResponseEntity<String> registerDriverToCabHandler( @PathVariable() Integer driverId, @PathVariable() Integer cabId){

		String registerDriverToCab = driverServiceImpl.registerDriverToCab(driverId, cabId);

		return new ResponseEntity<String>(registerDriverToCab, HttpStatus.OK);
	}
}
