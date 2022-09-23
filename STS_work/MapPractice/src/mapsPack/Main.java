package mapsPack;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		TreeMap<Student, String> tm = new TreeMap<>(new StudentComp());

		tm.put(new Student(950,"Ganesh",1),"Maharastra");
		tm.put(new Student(850,"Surya",2),"Tamilnadu");
		tm.put(new Student(920,"Venkat",3),"Telangana");
		tm.put(new Student(910,"Dinesh",4),"Haryana");
		tm.put(new Student(880,"Srinu",5),"Kerla");	
	
		for(Student i:tm.keySet()) {
			System.out.println(i);
		}
	
		Set<Map.Entry<Student, String>> set = tm.entrySet();
		for(Map.Entry<Student, String> i:set) {
      
		String s =	i.getValue();
	Student stu =	i.getKey();


		System.out.println("Topper of state "+s);
		System.out.println("***********************");
//		System.out.println(stu);
		System.out.println("Roll :" + stu.getRoll());
		System.out.println("Name :" + stu.getNameString());
		System.out.println("Marks :" + stu.getMarks());
		System.out.println("-------------------------");
		
		}
		
		
	}

}
