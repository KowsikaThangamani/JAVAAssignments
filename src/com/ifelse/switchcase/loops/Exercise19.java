package com.ifelse.switchcase.loops;

public class Exercise19 {

	public static void main(String[] args) {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
				System.out.println(ch);
			}
		}

		char ch = 'a';
		while (ch <= 'z') {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
				System.out.println(ch);
			}
			ch++;
		}

	}

}
