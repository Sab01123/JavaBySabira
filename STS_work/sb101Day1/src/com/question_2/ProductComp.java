package com.question_2;

import java.util.Comparator;

public class ProductComp implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProductPrice()>o2.getProductPrice() ? +1:-1;
	}

}
