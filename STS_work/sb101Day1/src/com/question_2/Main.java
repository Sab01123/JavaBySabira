package com.question_2;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Queue<Product> q1 = new PriorityQueue<>(new ProductComp());
		
		Scanner s1 = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter product id");
			int id = s1.nextInt();
			
			System.out.println("Enter product name");
			String proName = s1.next();
			
			System.out.println("Enter product price");
			int price = s1.nextInt();
			
			q1.offer(new Product(id, proName, price));
			
			System.out.println("Do you want to add more Y/N");
			String more = s1.next();
			if(more.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		Iterator<Product> itr = q1.iterator();
		
		Integer i1;
		
while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
	}

}
