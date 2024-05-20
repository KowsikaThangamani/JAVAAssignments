package com.methods;

public class Exercise08 {

	public void factorialNumber (int num) {
		int factorial = 1;
		for (int i = num; i >= 1; i--) {
			 factorial = factorial * i;
		}
		System.out.println("Factorial of the number " + num + " is : " + factorial);
	}

	public static void main(String[] args) {

		Exercise08 obj = new Exercise08();
		obj.factorialNumber(5);

	}

}
