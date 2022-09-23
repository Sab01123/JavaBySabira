package collectionsArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import comparable.Student;
import comparator.StudentComp;

public class collectionsClass {

	public static void main(String[] args) {

		List<String> citie = Arrays.asList("Delhi","Mumbai","Chennai","Kolkata");
		Collections.sort(citie);
		System.out.println(citie);
		//[Chennai, Delhi, Kolkata, Mumbai]
		
		
		List<Student> students = Arrays.asList(
				new Student(12, "n1", 780),
				new Student(13, "n2", 580),	
				new Student(14, "n3", 480),
				new Student(15, "n4", 980)
				                            );
		
		
		Collections.sort(students,new StudentComp());
		System.out.println(students);
		
		
	}
	
	

}
