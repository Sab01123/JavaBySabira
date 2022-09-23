package com.question_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	

	public static void main(String[] args) {
		
		
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(1, "sabira", 200));
//		list.add(new Student(2, "zainab", 500));
//		list.add(new Student(3, "haleef", 600));
//		list.add(new Student(4, "noor", 103));
//		list.add(new Student(5, "ayzal", 400));
//predicate
		System.out.println("By Predicate");
		
Predicate<Student> p1 = s1-> s1.getMarks()<500;
		
		System.out.println(p1.test(new Student(10, "Mohammad", 400)));
// consumer
		System.out.println("By Consumer");
		Consumer<Student> c1 = c->{
			System.out.println(c.getRoll());
			System.out.println(c.getName());
			System.out.println(c.getMarks());
			
			System.out.println("-----------------");
		};
		c1.accept(new Student(2, "zainab", 200));
		c1.accept(new Student(3, "aabira", 300));
		c1.accept(new Student(4, "haleef", 500));
		c1.accept(new Student(5, "ayzal", 400));

		
		
//Supplier
		System.out.println("By Supplier");
		
		Supplier<Student> sup = ()-> new Student(22, "aaaa", 300);
		System.out.println(sup.get());
		
// Function
		
		System.out.println("By Function");
		
		Function<String, Integer> fun = i-> Integer.parseInt(i);
		System.out.println(fun.apply("25"));
		
	}

}
