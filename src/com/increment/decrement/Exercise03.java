package com.increment.decrement;

public class Exercise03 {

	public static void main(String[] args) {

		int i=19, j=29, k=0;
		int m = i-- - j-- - k--;//19-29-0

		System.out.println("i="+i);//18
		System.out.println("j="+j);//28
		System.out.println("k="+k);//-1
		System.out.println("m="+m);//-10

		int i1 = 11;
//		int j1 = --(++i); cannot perform both increment and decrement at the same time

		int m1 = 0, n = 0;
		int p = --m1 * --n * n-- * m1--;//-1*-1*-1*-1
		System.out.println(p);//1

		int a = 1;
		a = a++ + ++a * --a - a--;//1+3*2-2 --> 1+6-2 --> 7-2
		System.out.println(a);

//		int a1 = 11++; //Increment/Decrement should be applied only on the variable name

		int ch = 'A';
		System.out.println(ch++);//65

		char c = 'A';
		System.out.println(++c);//B

		double d = 1.5, D = 2.5;
		System.out.println(d++ + ++D);//1.5+3.5 --> 5.0

	}

}
