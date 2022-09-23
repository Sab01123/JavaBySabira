package com.question_3;

import com.question_4.Bank;

public abstract class  Parent {
// int num;
 abstract void method1();
	 
 
	 
	final void method2() {
    System.out.println("in Parent class");
		 
	 }
	
	 void method3() {
		 System.out.println("in Parent class");
	 }
 final int number;
 
// public Parent() {
//	this.number = 0;
//	// TODO Auto-generated constructor stub
//}

public Parent() {
	this.number = 0;
	// TODO Auto-generated constructor stub
}

public Parent(int number) {
	super();
	this.number = number;
}
 
 

}
