package com.methods;

public class Exercise04 {

//	4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.

	public void findMaxNumber (int a , int b, int c) {
		System.out.println("Finding the greatest of 3 numbers : " + a + " , " + b + " and " + c);

		if (a>b && a>c) {
			System.out.println("a is greater");
		}
		else if (b>c) {
			System.out.println("b  is greater");
		} else {
			System.out.println("c is greater");
		}
	}

	public void findMinNumber (int a , int b, int c) {
		System.out.println("Finding the smallest of 3 numbers : " + a + " , " + b + " and " + c);

		if (a<b && a<c) {
			System.out.println("a is smaller");
		}
		else if (b<c) {
			System.out.println("b  is smaller");
		} else {
			System.out.println("c is smaller");
		}
	}
	public static void main(String[] args) {

		Exercise04 obj = new Exercise04();
		obj.findMaxNumber(100, 200, 30);
		obj.findMinNumber(100, 200, 30);

	}

}
