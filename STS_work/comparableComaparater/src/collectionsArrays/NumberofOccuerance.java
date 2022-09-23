package collectionsArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class NumberofOccuerance {

	public static void main(String[] args) {

//getting number of occuerrence in a List:
		
//		List<Integer> list = Arrays.asList(10,20,30,10,40,50,10);
//		
//	int result =	Collections.frequency(list, 10);
//	System.out.println(result);//3
		
		
	//converting List to the synchronized list:	
	List<Integer> list = Arrays.asList(10,12,10,10,12,45,55);
List<Integer> slist	= Collections.synchronizedList(list);
Collections.sort(slist);
System.out.println(slist);
//[10, 10, 10, 12, 12, 45, 55]

TreeSet<Integer> tSet = new TreeSet<>(slist);
System.out.println(tSet);
//[10, 12, 45, 55]
	}

}
