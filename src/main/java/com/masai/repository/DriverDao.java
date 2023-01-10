package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Customer;
import com.masai.model.Driver;
@Repository
public interface DriverDao extends JpaRepository<Driver, Integer>{

	public List<Driver> findByDriverFromAndDriverTo(String fromWhere, String toWhere);

}
