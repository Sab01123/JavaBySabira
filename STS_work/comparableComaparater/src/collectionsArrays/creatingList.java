package collectionsArrays;

import java.util.Arrays;
import java.util.List;

import comparable.Student;

public class creatingList {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(10,20,30,50,16);
		
		System.out.println(integerList);
		
		
		List<String> cities = Arrays.asList("delhi","mumbai","assam");
		
		System.out.println(cities);
		
		List<Student> students = Arrays.asList(
				new Student(10, "n1", 780),
				new Student(10, "n1", 780),
				new Student(10, "n1", 780)
				                           );
		
		System.out.println(students);
		
	}

}
