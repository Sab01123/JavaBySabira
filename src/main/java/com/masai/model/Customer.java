package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	
	@Pattern(regexp = "[a-zA-Z]",message = "First Name must not contain numbers or special characters")
	private String	firstName;
	
	@Pattern(regexp = "[a-zA-Z]" , message = "Last Name must not contain numbers or special characters")
	private String	lastName;
	
	@Size(min = 10,max = 10,message = "MobileNumber length shoud be 10")
	private String	mobileNumber;

	private String	email;
	
	@Pattern(regexp = "[A-Za-z0-9!@#$%^&*_]{6,12}", message = "Password must be 6-12 characters in length and can include alphanumerics and special characters")
	private String	password;
	private Integer distanceFrom; 
	private Integer distanceTo;     
	private String driverFrom;   
	private String driverTo;
	private String role;
	
	
}


