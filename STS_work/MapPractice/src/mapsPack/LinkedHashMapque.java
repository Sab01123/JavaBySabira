package mapsPack;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapque {

	public static void main(String[] args) {

	LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
	
	lhm.put(1, "haleef");
	lhm.put(2, "sabira");
	lhm.put(2, "ayzal");
	lhm.put(4, "mohammad");

		for(Map.Entry<Integer, String> i:lhm.entrySet()) {
			System.out.println(i);
		}
		
		
		
	}

}
