package com.superkeyword.abstractclass;

public abstract class Medical {

	int min_fee = 10;

	public abstract void covid();

	public static void testing() {
		System.out.println("Medical --- testing");
	}

	public void bloodTest() {
		System.out.println("Medical --- bloodTest");
	}
}
