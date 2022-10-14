package com.masai.useCases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
//import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;

public class RegisterEmployee {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Register a new employee, provide details");
		try {
			System.out.println("enter name of employee");
			String name = sc.next();
			System.out.println("enter address");
			String address = sc.next();
			System.out.println("enter salary");
			int salary = sc.nextInt();
			
			Employee emp = new Employee(name, address, salary);
		Employee employee =	dao.registerEmployee(emp);
		System.out.println("Employee Registered with following details:");
		System.out.println(employee);
			
		} catch (Exception e) {
           System.out.println(e.getMessage());	
          
}
		
		
		
	}

}
