package com.ifelse.switchcase.loops;

public class Exercise20 {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			if (i%7 == 0) {
				System.out.println("Bye, See you tomorrow");
				break;
			}
			i++;
		}

	}

}
