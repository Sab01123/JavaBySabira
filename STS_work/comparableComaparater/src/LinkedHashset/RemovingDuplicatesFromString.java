package LinkedHashset;

import java.util.LinkedHashSet;

public class RemovingDuplicatesFromString {
	public static String removeDuplicate(String str) {
		
	char[]	chr = str.toCharArray();
		
	LinkedHashSet<Character> lhs = new LinkedHashSet<>();
	
	for(char i:chr) {
		
		lhs.add(i);
	}
	
	StringBuilder s = new StringBuilder("");
	
	for(char j:lhs) {
		s.append(j);
	}
	
	return s.toString();
	
	
	
	}
	

	public static void main(String[] args) {

	String st = RemovingDuplicatesFromString.removeDuplicate("sabira");
	System.out.println(st);
	
	
	}

}
