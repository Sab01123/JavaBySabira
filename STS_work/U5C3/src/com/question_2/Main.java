package com.question_2;

public class Main {

	public static void main(String[] args) {

		ProductNum p = new ProductNum();
		
		p.start();
		
		synchronized (p) {
			try {
				p.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("product is: "+p.pro);
		}
		
	}

}
