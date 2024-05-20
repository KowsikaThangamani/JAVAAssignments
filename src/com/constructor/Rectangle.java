package com.constructor;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}

	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea () {
		double area = length * width;
		return area;
	}

	public static void main(String[] args) {

		Rectangle obj = new Rectangle();
		System.out.println(obj.calculateArea());

		Rectangle obj1 = new Rectangle(2.5, 3.5);
		System.out.println(obj1.calculateArea());

	}

}
