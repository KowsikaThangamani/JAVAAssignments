package com.inheritance.naveen;

public class Institute extends WEO {

	@Override
	public void infrastructure() {
		System.out.println("Institute --- Infrastructure");
	}

	@Override
	public void feeStructure() {
		System.out.println("Institute --- Fee structure");
	}

	public void courses() {
		System.out.println("Institute --- courses");
	}
}
