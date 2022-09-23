package com.question_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		TreeMap<Student, String> tm = new TreeMap<>(new StudentComp());

		tm.put(new Student(1, "sab", 500), "srinagar");
		tm.put(new Student(1, "sab", 500), "delhi");
		tm.put(new Student(3, "zainab", 100), "patna");
		tm.put(new Student(4, "haleef", 300), "jammu");
		tm.put(new Student(5, "mohammad", 200), "pune");

//	Set<Map.Entry<Student, String>> set	= tm.entrySet();
	
	for(Map.Entry<Student, String> i:tm.entrySet()) {
	Student stu	= i.getKey();
	String s	= i.getValue();
	System.out.println(s);
	System.out.println(stu.getName());
	System.out.println(stu.getMarks());
	System.out.println(stu.getRoll());
	System.out.println("==================");

	
	}
		
	}

}
