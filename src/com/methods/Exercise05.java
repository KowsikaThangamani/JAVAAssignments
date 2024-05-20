package com.methods;

public class Exercise05 {

//	5. Def﻿ine a program to find out whether a given number is even or odd - return true/false.

	public boolean findOddOrEven (int i) {
		System.out.println("Finding whether the given numbers are odd or even. The number is : " + i);

		if (i%2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Exercise05 obj = new Exercise05();

		boolean isOddOrEven = obj.findOddOrEven(25);
		if (isOddOrEven) {
			System.out.println("The given number is even");
		} else {
			System.out.println("The given number is odd");
		}

	}

}
