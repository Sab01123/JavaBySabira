package itratorItrator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ItrateString {

	public static void main(String[] args) {

		List<String> li = Arrays.asList("a","b","c","d","e");
		
		Iterator<String> itr = li.iterator();
		
		while(itr.hasNext()) {
		String s =	itr.next();
		
		System.out.println(s);
		}
		
	}

}
