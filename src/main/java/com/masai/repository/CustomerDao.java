package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.model.Customer;
import com.masai.model.Driver;
@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{

	public Customer findByEmail(String email);	
}
