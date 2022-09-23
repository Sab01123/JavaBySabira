package com.question_1;

import java.util.ArrayList;
import java.util.Iterator;


public class MainArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Delhi");
		arr.add("Mumbai");
		arr.add("Punjab");
		arr.add("Patna");
		arr.add("Kashmir");
		arr.add("Ladakh");

		
//forloop
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("==========================");
		
//enhanced for loop
		for(String i:arr) {
			System.out.println(i);
		}
		
		System.out.println("==========================");
		

//Using Iterator
		
		 Iterator<String> iter  = arr.iterator();
        
         while (iter.hasNext()) {
         System.out.println(iter.next() + " ");
     }
		
		
	}

}
