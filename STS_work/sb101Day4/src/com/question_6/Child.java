package com.question_6;

public class Child extends Parent{

	public Child() throws Exception {
		super();
System.out.println("Inside child constructor");	}

	public static void main(String[] args) {

		try {
			Parent d1 = new Child();
			d1.fun1();
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

}
