package com.question_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();
		list.add("delhi");
		list.add("assam");
		list.add("patna");
		list.add("pune");
		list.add("kashmir");
		list.add("chandhigarh");
		
Collections.sort(list,(s1,s2)->s1.compareTo(s2));	

		list.forEach(i->System.out.println(i));
	}

}
