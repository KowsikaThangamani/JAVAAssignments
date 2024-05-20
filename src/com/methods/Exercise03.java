package com.methods;

public class Exercise03 {

	public void circleAreaCircumference (int radius) {
		double circumference = 2*22/7*radius;
		double area = 3.14*radius*radius;
		System.out.println("Circumference of the circle is : " + circumference);
		System.out.println("Area of the circle is : " + area);
	}

	public static void main(String[] args) {

		Exercise03 obj = new Exercise03();
		obj.circleAreaCircumference(3);

	}

}
