package com.question_3;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		double per =0;
		if(employeeObj instanceof PermanentEmployee) {
			PermanentEmployee pe1 = (PermanentEmployee)employeeObj;
		Double salary = employeeObj.getSalary();
		  per =  (15*salary)/100;
		
		}
		else if(employeeObj instanceof TemporaryEmployee)
		{
			TemporaryEmployee te1 = (TemporaryEmployee)employeeObj;
			Double salary = employeeObj.getSalary();
			 per =  (10*salary)/100;
		}
		return per;
	}

}
