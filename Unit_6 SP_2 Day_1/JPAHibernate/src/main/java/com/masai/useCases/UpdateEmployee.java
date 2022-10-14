package com.masai.useCases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;

public class UpdateEmployee {

	public static void main(String[] args) {
          EmployeeDao dao = new EmployeeDaoImpl();
          Scanner sc = new Scanner(System.in);
//          try {
////		System.out.println("enter id of employee you want to update");
////		int id = sc.nextInt();
//        System.out.println("enter name of employee you want to update");
//  		String name = sc.next();
//		System.out.println("enter address");
//		String address = sc.next();
//		System.out.println("enter salary");
//		int salary = sc.nextInt();
//		Employee emp = new Employee(name, address, salary);
//	    Employee em1 =	dao.updateEmployee(emp);
//	    System.out.println(em1);
//		} catch (EmployeeException e) {
//			System.out.println(e.getMessage());	
//}
          
          
         try {
			System.out.println("enter id");
			int id = sc.nextInt();
			Employee emp = dao.getEmployeeById(id);
			if(emp==null) {
				System.out.println("Employee with such id doesn't exist");
			}
			else {
				System.out.println("enter new address");
				String address = sc.next();
				emp.setAddress(address);
				Employee e1 = dao.updateEmployee(emp);
				System.out.println(e1);
			}
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
