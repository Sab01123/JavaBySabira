package com.question_3;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double circleArea(int radius) {
		// TODO Auto-generated method stub
		return  (3.14*Math.pow(radius, 2));
	}

}
