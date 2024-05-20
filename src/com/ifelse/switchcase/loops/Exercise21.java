package com.ifelse.switchcase.loops;

public class Exercise21 {

	public static void main(String[] args) {

		int num[] = {10, 20, 30, 40, 50};
		int count = num.length-1;
		for (int e : num) {
			e = count;
			System.out.println(num[e]);
			count--;
		}

		int i = 0;
		for (int e : num) {
			System.out.println(i + " - " + e);
			i++;
		}

	}

}
