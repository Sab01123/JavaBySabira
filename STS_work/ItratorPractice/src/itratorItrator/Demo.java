package itratorItrator;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
List<String> list= Arrays.asList("a","b","c","d","e");
		
		System.out.println(list);
		ListIterator<String> ltr= list.listIterator();
		
		while(ltr.hasNext()) {
			
			System.out.println(ltr.next());
		}
				
		System.out.println(list);
	}

}
