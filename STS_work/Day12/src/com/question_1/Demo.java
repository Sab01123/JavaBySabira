package com.question_1;

public class Demo {

	
	
	public static void main(String[] args) {

		ZImpl z1 = new ZImpl();
		
	if(z1 != null) {
		z1.fun1x();
		z1.fun2x();
		X.fun3x();
		
		z1.fun1y();
		z1.fun2y();
		Y.fun3y();
		
		z1.funZ();
	}
	else {
		System.out.println("null not allowed");
	}
		
	}

}
