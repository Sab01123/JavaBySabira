package list.listedArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public Map<String, Student> sortMapValue(HashMap<String, Student> hm){
		
	}

	public static void main(String[] args) {

		HashMap<String, Student> hm = new HashMap<>();
		
		hm.put("Maharastra",new Student(10,"Ganesh",950));
		hm.put("Tamilnadu",new Student(12,"Surya",850));
		hm.put("Telangana",new Student(15,"Venkat",920));
		hm.put("Haryana",new Student(16,"Dinesh",910));
		hm.put("Kerla",new Student(18,"Srinu",880));

Set<String>	states	= hm.keySet();
for(String s:states) {
	System.out.println(states);
}
		
  Collection<Student> col =  hm.values();	
  List<Student> students = new ArrayList<>(col);
  
  for(Student student:students) {
	  System.out.println(student.getRoll());
	  System.out.println(student.getName());
	  System.out.println(student.getMarks());

  }
Set<Map.Entry<String, Student>> set =   hm.entrySet();
List<Map.Entry<String, Student>> list = new ArrayList<>(set);
//Collections.sort(list);
for(Map.Entry<String, Student> i:set) {
	System.out.println("topper student of state "+i.getKey());
	System.out.println("-----------------");
Student s1	= i.getValue();
	System.out.println(s1.getName());
	System.out.println(s1.getRoll());
	System.out.println(s1.getMarks());
	
}



	}

}
