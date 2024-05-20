package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise05 {

	public static void main(String[] args) {

		ArrayList<String> studentNames = new ArrayList<>();

		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");

		Collections.reverse(studentNames);
		System.out.println(studentNames);

	}

}
