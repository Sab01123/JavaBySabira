package com.question_4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> productList=new ArrayList<>();
	
public void addProductToList(Product product) {
	int c=0;
		for(Product i:productList) {
			if(i.equals(product)) {
				c++;
				System.out.println("Count updated Product already exists" + c);
			}
			else {
				productList.add(product);
				System.out.println("Product added successfully");
			}
		}
	
	}
		
	
List<Product> showAllProduct(){
		return productList;
	}
public Ecommerce() {
	// TODO Auto-generated constructor stub
}

}
