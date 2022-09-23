package com.question_3;

public class Main {
public static void main(String[] args) {
	Shapes s1 = new Shapes();
	
	s1.area(new Circle());
	s1.area(new Rectangle());
	s1.area(new Square());
	
}
}
/*If the Polymorphism is existed at compilation time then it is
called as Static Polymorphism.In the above example, method overloading (same method name
that is area(), but the parameter are different that is Circle,rectangle,square)
It is also know as compile time polymorphism, i.e. which method will be called,
decided at compile time only.*/