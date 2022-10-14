package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entities.Employee;
import com.masai.exception.EmployeeException;
import com.masai.util.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {

		Employee emp;
		try {
		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		emp = employee;
		em.close();
		
			
		} catch (Exception e) {
             System.out.println(e.getMessage());
             EmployeeException ee = new EmployeeException("Not Registered");
             throw ee;
		}
		
		return emp;
		
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		EntityManager em = EMUtil.provideEntityManager();
       Employee e1;
		try {
			
	     Employee  emp = em.find(Employee.class, empId);
	     em.close();
		e1 = emp;
			
		} catch (Exception e) {
         System.out.println(e.getMessage());

         EmployeeException ee = new EmployeeException("Employee with this id "+empId+" is not found.");
         throw ee;
		}
		return e1;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		EntityManager em =  EMUtil.provideEntityManager();
	   Employee e1;
		try {
	    	Employee emp =	em.find(Employee.class, empId);
		 
		    	em.getTransaction().begin();
		    	em.remove(emp);
		    	em.getTransaction().commit();
		    	em.close();
		    	e1 = emp;
		    
		} catch (Exception e) {
         System.out.println(e.getMessage());
         EmployeeException ee = new EmployeeException("Employee with id "+empId +" not found to delete");
         throw ee;
       }
		return e1;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
      EntityManager em = EMUtil.provideEntityManager();
//      Scanner sc = new Scanner(System.in);
      Employee e1 = null;
      
//      try {
//    	Employee emp =  em.find(Employee.class, employee);
////    	if(emp!=null) {
//    		System.out.println("enter new name");
//    		String name = sc.next();
//    		System.out.println("enter new address");
//    		String address = sc.next();
//    		System.out.println("enter salary");
//    		int salary = sc.nextInt();
//    		
//    		em.getTransaction().begin();
//    		emp.setName(name);
//    		emp.setAddress(address);
//    		emp.setSalary(salary);
//    		em.getTransaction().commit();
//    		em.close();
//    		e1 = emp;
////    	}
//		
//	} catch (Exception e) {
//            System.out.println(e.getMessage());	
//            EmployeeException ee = new EmployeeException("Not found");
//            throw ee;
//}
//		return e1;
      try {
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();
		em.close();
		e1 = employee;
	} catch (Exception e) {
System.out.println(e.getMessage());
EmployeeException ee = new EmployeeException("Employee not found");
	}
      return e1;
	}

}
