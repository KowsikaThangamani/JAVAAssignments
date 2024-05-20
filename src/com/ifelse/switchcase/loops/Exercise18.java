package com.ifelse.switchcase.loops;

public class Exercise18 {

	public static void main(String[] args) {

		for (float f = 1.0f; f <= 10.0; f++) {
			System.out.println(f);
		}

		for (int i = 0; i <= 100; i+=9) {
			System.out.println(i);
		}

		for (int i = 0; i <= 100; i++) {
			if (i%9 == 0) {
				System.out.println(i);
			}
		}

	}

}
