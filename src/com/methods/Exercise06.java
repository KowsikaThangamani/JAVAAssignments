package com.methods;

public class Exercise06 {

//	6. A person is eligible to vote if his/her age is greater than or equal to 18.
		//	Define a method to find out if he/she is eligible to﻿ vote. - return true/false

	public boolean votingCriteria (int age) {
		System.out.println("Finding out if a person is eligible to vote if his/her age is : " + age);

		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Exercise06 obj = new Exercise06();

		boolean isEligible = obj.votingCriteria(171);
		if (isEligible) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not Eligible");
		}

	}

}
