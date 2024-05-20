package com.datatypes;

public class Exercise01 {

	public static void main(String[] args) {

//		1. Write a Java program to add two strings:
		String a = "Hello";
		String b = "Kowsika T";
		System.out.println(a+" "+b);

//		2. Write a Java program to print the sum of two numbers.
		int x = 74;
		int y = 36;
		System.out.println(x+y);

//		 3. Write a Java program to print the division of two numbers.
		int i = 50;
		int j = 3;
		System.out.println(i/j);

//		4. Write a Java program to compute the specified expressions and print the output. Go to the editor.
		double num = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(num);//(89.25-12.25)/36 --> 77/36 --> 2.138888888888889

//		5. Try to concat "Hello Selenium" with a character 't'.
		String c = "Selenium";
		char t = 't';
		System.out.println(a+ " " + c + t);

//		6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : "Your Total  amount is: 3700".
		int a1 = 100;
		int a2 = 200;
		int a3 = 3400;
		System.out.println("Your Total Amount Is : " + (a1+a2+a3));

//		7. Print the ASCII value of the character 'h'.
		char c1 = 'h';
		System.out.println((byte)c1);

//		8. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		char ch = 'd';
		int d = ch+3;
		System.out.println((char)d);

//		9. Write a program to find the square of the number 3.9.
		double f = 3.9;
		System.out.println(f*f);
		System.out.println(Math.pow(f, 2));


	}

}
