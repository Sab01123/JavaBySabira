package com.question_2;

public class Demo {

	
//	Demo()
//	2. Demo(String s)
//	3. Demo(int i)
//	4. Demo(float f)
	String s;
	int i;
	float f;
public Demo() {
	this("sabira");
	
	System.out.println("i am in Demo");
//	System.out.println(s);
}
Demo(String s){
	this(10);
	System.out.println("i am in Demo of string");
//	System.out.println(i);

}
Demo(int i){
	this(10f);
	System.out.println("i am in Demo of int");
//System.out.println(f);
}
Demo(float f){
	
	System.out.println("i am in Demo of float");

}
public static void main(String[] args) {

	Demo d = new Demo();
}
}
