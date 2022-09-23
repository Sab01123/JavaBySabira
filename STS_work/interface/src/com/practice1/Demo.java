package com.practice1;


public class Demo {

	
	public static void main(String[] args) {

		//one way
//		ParentX p1 = new ChildX();
//		p1.fun1();
//		p1.fun2();
//		
//		ChildX x1 = (ChildX)p1;
//		x1.fun1();
//		x1.fun2();
//		x1.fun3();
//		System.out.println(x1.i);
		
		
		//Other way
		ChildX x = new ChildX();
		x.fun1();
		x.fun2();
		x.fun3();
	System.out.println(x.i);
	
	}

}
