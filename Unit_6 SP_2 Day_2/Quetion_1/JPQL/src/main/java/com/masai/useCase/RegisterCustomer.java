package com.masai.useCase;

import javax.persistence.EntityManager;

import com.masai.entities.Address;
import com.masai.entities.Customer;
import com.masai.utility.EMUtil;

public class RegisterCustomer {

	public static void main(String[] args) {

	EntityManager em =	EMUtil.provideEntityManager();
	
	Customer cus = new Customer();
    
	cus.setName("sabira");
	cus.setMobileNumber("123456789");
	cus.setEmail("sab@gmail.com");
	cus.getAddreses().add(new Address("j&k", "srinagr", "190008", "HomeAddress"));
	cus.getAddreses().add(new Address("bihar", "patna", "1111111", "OfficeAddress"));

	em.getTransaction().begin();
	em.persist(cus);
	em.getTransaction().commit();
	em.close();
	
	System.out.println("Customer Details & Addresses add successfully");
	}

}
