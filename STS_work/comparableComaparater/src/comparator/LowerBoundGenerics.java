package comparator;

import java.util.Arrays;
import java.util.List;

public class LowerBoundGenerics {
	
	public static void fun1(List<? super Integer> list) {
		for(Object i:list) {
			System.out.println(i);
		}
		System.out.println("=======");
	}

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1,2,3,4,5,6);
		
		List<Number> ln = Arrays.asList(12,13,14,15);
		
		List<Object> lo = Arrays.asList(10,20,14,55,60);
		
		fun1(li);
		fun1(ln);
		fun1(lo);

	}

}
