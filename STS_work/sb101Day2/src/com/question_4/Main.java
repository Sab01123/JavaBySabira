package com.question_4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {

		HashMap<String, Student> hm = new HashMap<>();
		
		hm.put("delhi", new Student(1, "sabira",500));
		hm.put("punjab", new Student(2, "aabira",300));
		hm.put("kolkata", new Student(3, "farooq",400));
		hm.put("pune", new Student(4, "zainab",200));
		hm.put("patna", new Student(5, "haleef",100));
		
		
List<Map.Entry<String, Student>> l	= new LinkedList<Map.Entry<String,Student>>(hm.entrySet());
Collections.sort(l, new Comparator<Map.Entry<String, Student>>() {

	@Override
	public int compare(Entry<String, Student> o1, Entry<String, Student> o2) {
		return o1.getValue().getMarks() <o2.getValue().getMarks() ? +1:-1;
	}
});

HashMap<String, Student> temp = new LinkedHashMap<String, Student>();
for (Map.Entry<String, Student> aa : l) {
    temp.put(aa.getKey(), aa.getValue());
}
//return temp;

for(Map.Entry<String, Student> i:temp.entrySet()) {
	System.out.println(i.getKey() + "-"  + i.getValue());
	System.out.println("=================");
}

		
//		TreeMap<String, Student> tm = new TreeMap<>(hm);
//		
//	Set<Map.Entry<String, Student>> set	= tm.entrySet();
//		for(Map.Entry<String, Student> i: set) {
//		Student stu	= i.getValue();
//		String s	= i.getKey();
//		System.out.println(s);
//		System.out.println(stu.getRoll());
//		System.out.println(stu.getName());
//		System.out.println(stu.getMarks());
//
//		}
//		
//	Collection<Student> col	= hm.values();
//List<Student> li =	new ArrayList<>(col);
//		
//	Set<Map.Entry<String, Student>> s = hm.entrySet();
//	for(Map.Entry<String, Student> me:s) {
//		System.out.println(me);
//	}
	
	}

}
