package com.ifelse.switchcase.loops;

public class Exercise15 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i%5 == 0) {
				System.out.println(i);
			}
		}

		int i = 1;
		while (i <= 100) {
			if (i%5 == 0) {
				System.out.println(i);
			}
			i++;
		}

		int j = 1;
		do {
			if (j%5 == 0) {
				System.out.println(j);
			}
			j++;
		}while (j <= 100);
	}

}
