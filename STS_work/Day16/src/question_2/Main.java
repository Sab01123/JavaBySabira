package question_2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Employee> ts = new TreeSet<>(new Employeecomp());
		
		Scanner sc = new Scanner(System.in);
		
		int i =0;
		int j = 1;
		while(i<4) {
			System.out.println("Enter Employee Details"+j);
            System.out.println("Enter employee id");
            int id = sc.nextInt();
            System.out.println("Enter employee name");
            String name = sc.next();
            System.out.println("enter employee salary");
            double salary = sc.nextDouble();
            ts.add(new Employee(id, name, salary));
		i++;
		j++;
		
		}
		for(Employee x:ts) {
			System.out.println(x);
		}
		
	}

}
