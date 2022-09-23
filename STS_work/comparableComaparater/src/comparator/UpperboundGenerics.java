package comparator;

import java.util.Arrays;
import java.util.List;

public class UpperboundGenerics {
	
	public static void fun1(List<? extends Person> list) {
		for(Person p:list) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {

		
		List<Student> li = Arrays.asList(
				new Student(1, "sab", 10),
				new Student(2, "sab", 50),
				new Student(3, "sab", 20)
				
				);
	
		fun1(li);
		
	}

}
