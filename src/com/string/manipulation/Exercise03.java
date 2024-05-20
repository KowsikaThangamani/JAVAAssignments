package com.string.manipulation;

public class Exercise03 {

	public static void main(String[] args) {

		String str = "Welcome to Naveen Automation Labs";

		int e = str.indexOf('e', (str.indexOf('e', str.indexOf('e')+1))+1);
		System.out.println(e);

		System.out.println(str.indexOf("Automation"));

		String arr[] = str.split("\\s+");
		for (String s : arr) {
			System.out.println(s);
		}

		System.out.println(arr[(arr.length-1)/2]);
//		for ()

	}

}
