package LinkedHashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Stringremove {
	
	
	public static List<String> removeDuplicateFromList(List<String> cities){
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>(cities);
		
return new ArrayList<>(lhs);		
	}

	public static void main(String[] args) {

		
		List<String> cities = new ArrayList<>();
		
		cities.add("delhi");
		cities.add("delhi");
		cities.add("mumbai");
		cities.add("srinagar");
		cities.add("patna");
		
	List<String> result =	Stringremove.removeDuplicateFromList(cities);
		
		for(String i:result) {
			System.out.println(i);
		}
	}

}
