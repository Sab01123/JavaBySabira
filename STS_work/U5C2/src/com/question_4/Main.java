package com.question_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("sabira");
		list.add("farooq");
		list.add("mohammad");
		list.add("ayzal");
		list.add("haleef");
		list.add("zainab");
		list.add("mehak");
		list.add("fatima");
		list.add("ahti");
		list.add("nishi");

//List<String> l = list.stream().filter(i->(i.length()%2==0)).collect(Collections.toList());
		List<String> list2 = list.stream().filter(i->i.length()%2==0).collect(Collectors.toList());
		
		Collections.sort(list2);
		Collections.reverse(list2);
		
		list.forEach(s->System.out.println(s+" "));
		
		System.out.println("******************");
		
		System.out.println();
		
		list2.forEach(s->System.out.println(s.toUpperCase()+" "));
	}

}
