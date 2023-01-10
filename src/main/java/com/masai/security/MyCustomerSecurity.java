package com.masai.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.masai.model.Customer;
@Component
public class MyCustomerSecurity implements UserDetails{
	

//	@Autowired
	private Customer customer = new Customer();
	
	MyCustomerSecurity(){
		
	}
	
	public MyCustomerSecurity(Customer customer) {
		this.customer = customer;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();

        grantedAuthorityList.add(new SimpleGrantedAuthority(customer.getRole()));

        return grantedAuthorityList;
	}

	@Override
	public String getPassword() {
		return customer.getPassword();
	}

	@Override
	public String getUsername() {
		return customer.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
