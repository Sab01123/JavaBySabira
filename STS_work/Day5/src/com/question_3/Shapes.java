package com.question_3;

public class Shapes {
	 public void area(Circle circle) {
		 circle.radius = 2;
		 System.out.println(3.14*Math.pow(circle.radius, 2));
	 }
     public void area(Rectangle rectangle) {
    	rectangle.l = 2;
    	 rectangle.b = 6;
    	 System.out.println(rectangle.l*rectangle.b);
     }
     public void area(Square square) {
    	 square.side = 4;
    	 System.out.println(Math.pow(square.side, 2));
     }
}
class Circle{
	int radius;
}
class Rectangle{
	int l;
	int b;	
}
class Square{
	int side;
}