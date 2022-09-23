package com.question_4;

import java.util.List;

public class Main {
	
	

	public static void main(String[] args) {



		Ecommerce ecommerce = new Ecommerce();
		ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",12));
		ecommerce.addProductToList(new Product("Ipad",100000,"Apple",2));
		ecommerce.addProductToList(new Product("Ipad",100000,"Apple",4));
		ecommerce.addProductToList(new Product("Shoes",4000,"Nike",4));
		ecommerce.addProductToList(new Product("Shoes",2000,"Adidas",8));
//		System.out.println(ecommerce.showAllProduct());
		
//	Product p1 = 	(Product) ecommerce.showAllProduct();
//	
//		System.out.println(p1);
		
//		Scanner s1 = new Scanner(System.in);
//		System.out.println();
		
		List<Product> e1 = ecommerce.showAllProduct();
		for(Product i:e1) {
			System.out.println(i);
		}
	}

}
