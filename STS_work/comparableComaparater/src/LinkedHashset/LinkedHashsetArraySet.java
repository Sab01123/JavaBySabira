package LinkedHashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashsetArraySet {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(50);
		al.add(20);
        al.add(10);
		al.add(10);
		al.add(40);

//		System.out.println(al);
//		for(int i:al) {
//			System.out.println(i);
//		}
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(al);
		
//		for(int i:lhs) {
//		System.out.println(lhs);
//		}
		
		al = new ArrayList<>(lhs);
		
//		System.out.println(al);
		for(int i:al) {
			System.out.println(i);//50
			                     //20
			                     //10
			                     //40
		}
		
	}

}
