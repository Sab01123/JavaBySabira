package com.question_1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){

HashMap<Employee, String> hm = new HashMap<>(originalMap);

List<Map.Entry<Employee, String>> list = new LinkedList<>(hm.entrySet());
Collections.sort(list, new Comparator<Map.Entry<Employee, String>>() {

	@Override
	public int compare(Entry<Employee, String> o1, Entry<Employee, String> o2) {
		return o1.getKey().getSalary() >o2.getKey().getSalary() ? +1:-1;
	}
	
});
		HashMap<Employee, String> hm2 = new LinkedHashMap<Employee,String>();
		
		for(Map.Entry<Employee, String> i:list) {
			hm2.put(i.getKey(), i.getValue());
		}
		return hm2;
		
	}

	public static void main(String[] args) {

		Demo d1 = new Demo();
HashMap<Employee, String> hm	= new HashMap<>();	
hm.put(new Employee(1, "sabira", 100), "mumbai");
hm.put(new Employee(2, "farooq", 500), "mumbai");
hm.put(new Employee(3, "mohammad", 300), "mumbai");
hm.put(new Employee(4, "haleef", 200), "mumbai");


Map<Employee, String> m1 =  d1.sortMapUsingEmployeeSalary(hm);


// Set<Map.Entry<Employee, String>> set= hm.entrySet();

 for(Map.Entry<Employee, String> i:m1.entrySet()) {
	 
Employee e1 = 	 i.getKey();
	String s1 = i.getValue();
	
	System.out.println(s1);
	System.out.println(e1.getSalary());
	System.out.println(e1.getName());
	System.out.println(e1.getEmpId());

	
 }
 
 
	}

}
