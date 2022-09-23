package mapsPack;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPrac {

	public static void main(String[] args) {


		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("Maharastra","Mumbai");
		tm.put("Telangana","Hydrabad");
		tm.put("Tamilnadu","Chennai");
		tm.put("Karnataka","Bangaluru");
		tm.put("Bihar","Patna");
	
//	System.out.println(tm);
		
		for(Map.Entry<String, String> i:tm.entrySet()) {
			System.out.println(i);
		}
	
	
	
	
	
	
	}

}
