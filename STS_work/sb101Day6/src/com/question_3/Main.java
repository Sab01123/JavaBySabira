package com.question_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public Map<String, Student> sortMapUsingStudentName(Map<String, Student>
	originalMap) {
	originalMap.entrySet().stream().sorted(Map.Entry.comparingByKey
			((s1,s2)->s2.compareTo(s1))).forEach(i->System.out.println
					(i.getKey()+" "+i.getValue()));
	return originalMap;
	}


	public static void main(String[] args) {

		Main m1 =new Main();
		
		Map<String, Student> map = new HashMap<>();
		map.put("kashmir", new Student(1, "sabira", "sab@gmai.com", 500));
		map.put("patna", new Student(2, "noor", "noor@gmai.com", 900));
		map.put("bihar", new Student(3, "ayzal", "ayzal@gmai.com", 100));
		map.put("srinagar", new Student(4, "haleef", "haleef@gmai.com", 600));
		map.put("delhi", new Student(5, "zainab", "zainab@gmai.com", 400));
		
	Map<String, Student> map2 =	m1.sortMapUsingStudentName(map);
		

	
	}

}
