package com.masai.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.model.Customer;
import com.masai.repository.CustomerDao;
@Service
public class MyCustomerSecurityService implements UserDetailsService{

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Customer customer = customerDao.findByEmail(username);
		
		if(customer == null)
			throw new UsernameNotFoundException("User doesn't exist");
		
		return new MyCustomerSecurity(customer);
	}

}
