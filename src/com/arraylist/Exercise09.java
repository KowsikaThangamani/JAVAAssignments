package com.arraylist;

import java.util.ArrayList;

public class Exercise09 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>(10);

		colors.add("Black");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Red");
		colors.add("Pink");

		System.out.println(colors.size());
		colors.trimToSize();
		System.out.println(colors.size());

	}

}
