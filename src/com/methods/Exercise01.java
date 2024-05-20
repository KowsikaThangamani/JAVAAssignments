package com.methods;

public class Exercise01 {

//	1.Write a program to print the addition/subtraction/division/multiplication of two numbers by defining your own method

	public int calculation (int a, int b, String operation) {
		System.out.println("Performing \"" + operation + "\" operation on two numbers : " + a + " and " + b);

		int output = -1;

		switch (operation) {
		case "ADDITION" :
			output = a+b;
			break;
		case "SUBTRACTION" :
			output = a-b;
			break;
		case "DIVISION" :
			output = a/b;
			break;
		case "MULTIPLICATION" :
			output = a*b;
			break;
		}

		return output;
	}

	public static void main(String[] args) {

		Exercise01 obj = new Exercise01();
		int output = obj.calculation(21, 2, "DIVISION");

		System.out.println("output is : " + output);

	}

}
