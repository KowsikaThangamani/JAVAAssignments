package com.ifelse.switchcase.loops;

public class Exercise02 {

	public static void main(String[] args) {

		int a = 25, b = 78, c = 87, d = 97;

		if (a>b && a>c && a>d) {
			System.out.println("a is greater. The number is : " + a);
		}
		else if (b>c && b>d) {
			System.out.println("b is greater. The number is : " + b);
		}
		else if (c>d) {
			System.out.println("c is greater. The number is : " + c);
		}
		else {
			System.out.println("d is greater. The number is : " + d);
		}

	}

}
