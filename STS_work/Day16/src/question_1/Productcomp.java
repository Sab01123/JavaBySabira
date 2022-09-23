package question_1;

import java.util.Comparator;

public class Productcomp implements Comparator<Product>{

	//1 for sorting the product according to the productPrice
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getProductPrice()>o2.getProductPrice())
			return +1;
		else if(o1.getProductPrice()<o2.getProductPrice())
			return -1;
		else 
			return 0;
	}
	
	//3 for sorting the product according to the productId
//	@Override
//	public int compare(Product p1, Product p2) {
//		if(p1.getProductId()>p2.getProductId())
//			return +1;
//		else if(p1.getProductId()<p2.getProductId())
//			return -1;
//		else 
//			return 0;
//	}
}
