package com.string.manipulation;

public class Exercise01 {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "hello";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String str = "    Hello    Everyone    ";
		System.out.println(str.trim());
		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replaceAll("\\s+", ""));

		System.out.println("Character at 0th index is : " + s1.charAt(0) + " And character at last index is : " + s1.charAt(s1.length()-1));

		if (str.contains("Hello")) {
			System.out.println("Sentence contains the word 'Hello'");
		} else {
			System.out.println("Word is not present");
		}


	}

}
