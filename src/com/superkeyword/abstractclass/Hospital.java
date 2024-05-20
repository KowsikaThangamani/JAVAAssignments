package com.superkeyword.abstractclass;

public class Hospital extends Medical {

	int min_fee = 50;

	@Override
	public void covid() {
		System.out.println(super.min_fee);
		System.out.println("Hospital --- covid");
		super.bloodTest();
		super.testing();
	}



}
