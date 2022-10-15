package com.masai.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int	cid;
	private String 	name;
	private String	mobileNumber;
	private String	email;
	
	@Embedded
	@ElementCollection
	private List<Address> addreses= new ArrayList<>();
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String name, String mobileNumber, String email, List<Address> addreses) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.addreses = addreses;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Address> getAddreses() {
		return addreses;
	}

	public void setAddreses(List<Address> addreses) {
		this.addreses = addreses;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", addreses=" + addreses + "]";
	}
	
	
	
	
}
