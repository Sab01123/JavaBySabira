package com.question_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {


		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "shampoo", 1, 200));
		list.add(new Product(2, "soap", 5, 150));
		list.add(new Product(3, "bag", 2, 700));
		list.add(new Product(4, "T-Shirt", 1, 500));
		list.add(new Product(5, "skirt", 3, 900));

		Collections.sort(list,(p1,p2)->p1.getPrice()<p2.getPrice() ? +1:-1);
		
		list.forEach(l->System.out.println(l));
	}

}
