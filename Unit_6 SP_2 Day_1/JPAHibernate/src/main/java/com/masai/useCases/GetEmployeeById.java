package com.masai.useCases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;

public class GetEmployeeById {

	public static void main(String[] args) {

   EmployeeDao dao = new EmployeeDaoImpl();
   Scanner sc  =  new Scanner(System.in);
   
  
   try {
	   System.out.println("Enter Employee id");
	   int id = sc.nextInt();
	   Employee emp =   dao.getEmployeeById(id);
	   if(emp!=null) {
		   System.out.println(emp);
	   }
	   
} catch (EmployeeException e) {
	System.out.println(e.getMessage());
}
		
	}

}
