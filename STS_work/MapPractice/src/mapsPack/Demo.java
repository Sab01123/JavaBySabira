package mapsPack;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	
	public Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		Comparator<Map.Entry<Employee, String>> cm = (e1,e2)->{
			return e1.getKey().getSalary() > e2.getKey().getSalary() ? +1:-1;
			
		};
		
		Set<Map.Entry<Employee, String>> set = originalMap.entrySet();
		
		Set<Map.Entry<Employee, String>> sortedSet = new TreeSet<>(cm);
		
		sortedSet.addAll(set);
		LinkedHashMap<Employee, String> lh = new LinkedHashMap<>();
		
		for(Map.Entry<Employee, String> i: sortedSet) {
			lh.put(i.getKey(), i.getValue());
		}
		return lh;
	}

	
	
	public static void main(String[] args) {

		Map<Employee, String> hm = new HashMap<>();
		hm.put(new Employee(1, "sab", 1200),"kashmir");
		hm.put(new Employee(2, "aab", 1900),"Delhi");
		hm.put(new Employee(3, "dab", 1100),"srinagar");
		hm.put(new Employee(4, "zab", 1700),"patna");
		hm.put(new Employee(5, "cab", 1600),"bihar");

		Demo d1 = new Demo();
Map<Employee, String>	m =	d1.sortMapUsingEmployeeSalary(hm);
		
for(Map.Entry<Employee, String> i:m.entrySet()) {

 Employee e =  i.getKey();
 String s = i.getValue();
System.out.println(s);
System.out.println(e);
System.out.println("====================");
}



	}

}
