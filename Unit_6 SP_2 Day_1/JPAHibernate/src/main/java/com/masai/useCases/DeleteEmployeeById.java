package com.masai.useCases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;

public class DeleteEmployeeById {

	public static void main(String[] args) {

EmployeeDao dao = new EmployeeDaoImpl();
Scanner sc = new Scanner(System.in);

try {
	System.out.println("enter id of employee you want to delete");
	int id = sc.nextInt();
Employee emp = dao.deleteEmployeeById(id);
if(emp!=null) {
	System.out.println("Employee with following details");
	System.out.println(emp);
	System.out.println("is deleted......");
}
} catch (EmployeeException e) {
System.out.println(e.getMessage());
}


	}

}
