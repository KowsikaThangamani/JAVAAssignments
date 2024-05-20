package com.methods;

import java.util.Arrays;

public class Exercise09 {

//	Exercise01
	public void printHello() {
		System.out.println("Hello, World!");
	}

//	Exercise02
	public int add (int a , int b) {
		int sum = a+b;
		return sum;
	}

//	Exercise03
	public boolean compareStrings (String s1, String s2) {
		if (s1.equalsIgnoreCase(s2)) {
			return true;
		} else {
			return false;
		}
	}

//	Exercise04
	public double calculateAverage (double[] num) {
		System.out.println("Calculating average of double numbers...");

		int size = num.length;
		double sum = 0.0;
		for (int i = 0; i < size; i++) {
			sum = sum + num[i];
		}
		double average = sum / size;
		return average;
	}

//	Exercise05
	public String concatenateString (String[] str) {
		String finalValue = "";
		for (String e : str) {
			finalValue = finalValue+e;
		}
		return finalValue;
	}

//	Exercise06
	public Object[] reverseArray (Object[] arr) {
		int j = 0;
		Object[] reverse = new Object[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			reverse[j] = arr[i];
			j++;
		}
		return reverse;
	}

//	Exercise07
	public void printArrayWithFactor (int factor, int[] arr) {
		for (int element : arr) {
			int result = element * factor;
			System.out.println("Multiplication of array value " + element + " by the given factor " + factor + " is : " + result);
		}
	}

//	Exercise08
	public void printStatusMessage (boolean status) {
		if (status) {
			System.out.println("success");
		} else {
			System.out.println("Failure");
		}
	}

//	Exercise09
	public String[] reverseStringArray (String[] arr) {
		int j = 0;
		String[] reverse = new String[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			reverse[j] = arr[i];
			j++;
		}
		return reverse;
	}

	public static void main(String[] args) {

		Exercise09 obj = new Exercise09();
		/*
		obj.printHello();
		int sum = obj.add(10, 80);
		System.out.println("sum of two numbers is : " + sum);

		boolean isEqual = obj.compareStrings("Java", "JAVAO");
		if (isEqual) {
			System.out.println("2 Strings are equal");
		} else {
			System.out.println("2 strings are not equal");
		}

		double[] myNumber = {1.0, 2.0, 3.0, 4.0, 5.0};
		double average = obj.calculateAverage(myNumber);
		System.out.println("Average is : " + average);

		String[] str = {"I", " am", " practising", " JAVA", " programs", " and", " I", " feel", " very", " confident"};
		String finalValue = obj.concatenateString(str);
		System.out.println(finalValue);

		Object[] arr = {"Saturday", "Friday", "THursday", "Wednesday", "Tuesday", "Monday", "Sunday"};
		Object[] reverse = obj.reverseArray(arr);
		System.out.println(Arrays.toString(reverse));

		int arr[] = {10, 3, 5, 8, 9, 21};
		obj.printArrayWithFactor(3, arr);
		*/

		String[] arr = {"Saturday", "Friday", "THursday", "Wednesday", "Tuesday", "Monday", "Sunday"};
		String[] reverse = obj.reverseStringArray(arr);
		System.out.println(Arrays.toString(reverse));
	}

}
