package com.question_3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		LinkedHashMap<String, String> hm = new LinkedHashMap<>();
		
		hm.put("Bihar", "patna");
		hm.put("punjab", "chandigarh");
		hm.put("assam", "dispur");
		hm.put("kashmir", "srinagar");
		hm.put("delhi", "new delhi");
		
Set<Map.Entry<String, String>> set	=	hm.entrySet();

 Iterator<Map.Entry<String, String>> itr = set.iterator();

 while(itr.hasNext()) {
	Entry<String, String> s = itr.next();
	System.out.println(s);
 }
 
 
	}

}
