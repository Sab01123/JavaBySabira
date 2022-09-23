package question_1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<Product> ts;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the choice :");
		
		int choice = sc.nextInt();
		
		if(choice==1) {
			ts = new TreeSet<>(new Productcomp());
		int i = 0;
			while(i<2) {
			System.out.println("enter product id");
			int id = sc.nextInt();
			System.out.println("enter product name");
			String name = sc.next();

			System.out.println("enter product price");
			double price = sc.nextDouble();
			ts.add(new Product(id, name, price));
			i++;
		}


		}
		else if(choice==2) {
			
			ts = new TreeSet<>(new Productcomp2());
			int i = 0;
			while(i<2) {
			System.out.println("enter product id");
			int id = sc.nextInt();
			System.out.println("enter product name");
			String name = sc.next();

			System.out.println("enter product price");
			double price = sc.nextDouble();
			ts.add(new Product(id, name, price));
			i++;
		}
			
		}
		else {
			ts = new TreeSet<>(new ProductComp3());
			int i = 0;
			while(i<2) {
			System.out.println("enter product id");
			int id = sc.nextInt();
			System.out.println("enter product name");
			String name = sc.next();

			System.out.println("enter product price");
			double price = sc.nextDouble();
			ts.add(new Product(id, name, price));
			i++;
		}
			
		}
		
		for(Product x:ts) {
			System.out.println(x);
		}
	}

}
