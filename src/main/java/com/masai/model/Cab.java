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
public class Cab {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cabId;
	private String cabType;
	
	@OneToOne
	private Driver driver;
	
}
