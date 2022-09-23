package list.listedArray;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {

		ArrayList  a1 = new ArrayList();	
		
		a1.add("sabira");
		a1.add("Delhi");
//		System.out.println(a1);
		a1.add(10);
		a1.add(null);
		a1.add("ksahmir");
	    a1.add(new A());
		a1.add(new Student(1, "sab", 100));
		a1.add(10);  // Integer 
		a1.add(true); //Boolean
		a1.add(10.55); //Double
		
//		System.out.println(a1);
		
		
		
		System.out.println(a1.get(1));// Delhi
		System.out.println(a1.get(6));
		System.out.println(a1.get(5));
		
		
		
		
		}

}
