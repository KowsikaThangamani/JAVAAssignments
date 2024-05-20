package com.ifelse.switchcase.loops;

public class Exercise17 {

	public static void main(String[] args) {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " - " + (int)ch);
		}

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + " - " + (int)ch);
		}

		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println(ch + " - " + (int)ch);
		}

		char ch = 'a';
		while (ch <= 'z') {
			System.out.println(ch + " - " + (int)ch);
			ch++;
		}

		char c = 'A';
		while (c <= 'Z') {
			System.out.println(c + " - " + (int)c);
			c++;
		}

		char i = '0';
		while (i <= '9') {
			System.out.println(i + " - " + (int)i);
			i++;
		}

	}

}
