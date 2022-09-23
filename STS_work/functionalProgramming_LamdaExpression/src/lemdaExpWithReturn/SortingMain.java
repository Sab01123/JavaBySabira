package lemdaExpWithReturn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingMain {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "sab", 100));
		list.add(new Student(2, "aab", 500));
		list.add(new Student(3, "zab", 200));
		list.add(new Student(4, "dab", 300));
		
		Collections.sort(list, (s1,s2) -> s1.getMarks()>s2.getMarks() ? +1:-1);
		
		for(Student s:list) {
			System.out.println(s);
		}
		
	}

}
