package functionalProg;

import java.util.function.Function;

import lemdaExpWithReturn.Student;

public class FunDemo {

	
	public static void main(String[] args) {
		
		Function<Student, String> f1 = s-> s.getMarks()>500?"Pass":"Fail";
		System.out.println(f1.apply(new Student(10, "sabira farooq", 800)));
		//Pass
		
		
		
	}
}
