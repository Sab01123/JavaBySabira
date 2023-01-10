package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer drivarId;
	private String driverName;
	private String driverEmail;
	private String driverPassword;
	private Integer distanceFrom;   //x
	private Integer distanceTo;     //y
	private String driverFrom;   
	private String driverTo;     

	
	@OneToOne
	private Cab cab;
}
