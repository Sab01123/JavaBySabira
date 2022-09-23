package mapsPack;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {

		
		HashMap<Integer, String> hm = new HashMap<>();
		
//		hm.put(1, "one");
//		hm.put(2, "two");
//		hm.put(3, "three");
//		System.out.println(hm);
//		hm.put(null, "four");//one null is allowd as a key
//		hm.put(null, "FOUR"); //four will be replaced with FOUR
//		hm.put(2, "TWO"); //two will be replaced with TWO
//		hm.put(5, "null");
//		hm.put(6, "null");//as a value any number of null be allowed
//System.out.println(hm.size());
//System.out.println(hm);
		
		hm.put(1, "one");
		hm.put(2, "two");
	    hm.put(3, "three");
	    hm.put(4, "four");
		hm.put(5, "five");
		
		System.out.println("Getting all the keys");
		
	Set<Integer> keys	= hm.keySet();
	for(Integer i: keys) {
		System.out.println(i);
	}
	
	System.out.println("Getting all the values");
Collection<String> str =  hm.values();
	
//for(String s:str) {
//	System.out.println(s);
//}

 Iterator<String> s  = str.iterator();
 while(s.hasNext()) {
	String s1 =  s.next();
	System.out.println(s1);
 }
System.out.println(hm);
		
	
	}

}
