package com.arrays;

public class Exercise02 {

	public static void main(String[] args) {

		int p[] = {1,3,4,5,22,56,89,90};

		for (int element : p) {
			System.out.println(element);
		}

		for (int e : p) {
			System.out.println(e);
		}

		int i = 0;
		while (i < p.length) {
			System.out.println(p[i]);
			i++;
		}

		int j = 0;
		do {
			System.out.println(p[j]);
			j++;
		} while (j < p.length);

	}

}
