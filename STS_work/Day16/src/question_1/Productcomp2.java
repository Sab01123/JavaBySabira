package question_1;

import java.util.Comparator;

public class Productcomp2 implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		return o1.getProductName().compareTo(o2.getProductName());
	}

}
