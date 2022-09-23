package itratorItrator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListItrator {

	public static void main (String args) {
		
		List<String> li = Arrays.asList("a","b","c","d","e");
		
ListIterator<String> litr	= li.listIterator();

while(litr.hasNext()) {
String s =	litr.next();
System.out.println(s);
}
System.out.println(123456);
System.out.println("=========================");
System.out.println(li);

	}
	
		
	}
	
	

