package com.question_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	

	public static void main(String[] args) {

		List<Student> l1 = new ArrayList<>();
		l1.add(new Student(1, "sabira", 100, "delhi"));
		l1.add(new Student(2, "mohammad", 300, "srinagar"));
		l1.add(new Student(3, "haleef", 600, "kashmir"));
		l1.add(new Student(4, "ayzal", 700, "patna"));
		l1.add(new Student(5, "zainab", 450, "bihar"));
		
//		l1.removeIf(i->i.getMarks()>500);
//		l1.forEach(System.out::println);
		
		Stream<Student> stu = l1.stream();

		List<Employee> l2 = stu.filter(s->s.getMarks()>500).map(s-> new Employee(s.getRoll(),s.getName(),s.getMarks()*10000,s.getAddress())).collect(Collectors.toList());		
		
		l2.forEach(s->{
			System.out.println("employee id "+s.getEmpId());
			System.out.println("employee name "+s.getName());
			System.out.println("employee salary "+s.getSalary());
			System.out.println("employee address "+s.getAddress());

System.out.println("---------------------------");
			
		});
				
	}

}
