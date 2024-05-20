package com.arraylist;

import java.util.ArrayList;

public class Exercise07 {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<>();

		colors.add("Black");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Red");
		colors.add("Pink");
		colors.add("Purple");
		colors.add("White");
		colors.add("Yellow");
		colors.add("Indigo");

		ArrayList<String> portion = new ArrayList<>(colors.subList(4, 8));

		System.out.println(portion);

	}

}
