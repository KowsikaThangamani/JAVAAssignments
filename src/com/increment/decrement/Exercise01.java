package com.increment.decrement;

public class Exercise01 {

	public static void main(String[] args) {

		int i = 11;
		i = i++ + ++i;
		System.out.println(i);

		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;//11+22+11+22+13+24
		System.out.println(a);//13
		System.out.println(b);//24
		System.out.println(c);//103

		/*
		 * boolean bl = true;
		 * System.out.println(bl++); TYPE MISMATCH : CANNOT CONVERT FROM BOOLEAN TO INT
		 */

	}

}
