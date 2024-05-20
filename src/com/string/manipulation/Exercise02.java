package com.string.manipulation;

public class Exercise02 {

	public String nameReverse (String name) {
		System.out.println("Reversing my name");
		String reversedName = "";
		for (int i = name.length()-1 ; i >= 0 ; i--) {
			reversedName = reversedName+name.charAt(i);
		}
		return reversedName;
	}

	public String stringPortion (String str) {
		String subStr = str.substring((str.length()-1)/2, str.length());
		return subStr;
	}

	public static void main(String[] args) {

		Exercise02 obj = new Exercise02();
		String revName = obj.nameReverse("arunee");
		System.out.println(revName);

		String subStr = obj.stringPortion("Hello my name is JAVA");
		System.out.println(subStr);
	}

}
