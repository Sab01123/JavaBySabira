package practice.question_3;

public class Shapes {
	  void area(Circle circle) {
		  circle.radius = 4;
		  System.out.println(3.14*(Math.pow(circle.radius, 2)));
	 }
      void area(Rectangle rectangle) {
    	 rectangle.length = 2;
    	 rectangle.breadth = 3;
    	 System.out.println(rectangle.length*rectangle.breadth);
     }
      void area(Square square) {
    	 square.side = 4;
    	 System.out.println(Math.pow(square.side, 2));
     }


}
class Circle {
	int radius;
}
class Rectangle{
	int length;
	int breadth;
}
class Square{
	int side;
}