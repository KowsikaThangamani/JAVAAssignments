package com.arraylist;

import java.util.ArrayList;

public class Exercise01 {

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

//	Exercise 01
		for (String e : colors) {
			System.out.println(e);
		}

//	Exercise 02
		System.out.println(colors.get(2));
		System.out.println(colors.get(5));
		System.out.println(colors);

//	Exercise 03
		colors.set(3, "Grey");
		System.out.println(colors);

//	Exercise 04
		colors.remove(2);
		System.out.println(colors);

//	Exercise 05
		for (String e : colors) {
			System.out.println(e);
			if (e.equals("Red")) {
				System.out.println("Found the color. Hence exiting the loop");
				break;
			}
		}
	}

}
