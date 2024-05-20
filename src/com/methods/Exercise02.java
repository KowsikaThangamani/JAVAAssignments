package com.methods;

public class Exercise02 {

//	2. Define a method that returns the product of two double numbers.

	public double multiplication (double a, double b) {
		System.out.println("Performing multiplication of two double numbers : " + a + " and " + b);

		double output = a*b;
		return output;
	}

	public static void main(String[] args) {

		Exercise02 obj = new Exercise02();
		double result = obj.multiplication(1.5, 5.0);

		System.out.println("Result is : " + result);

	}

}
