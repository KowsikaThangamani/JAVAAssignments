package com.Encapsulation;

public class TestUtil {

	public static void main(String[] args) {
		/*
		Person pp = new Person();

		pp.setName("sameer");
		pp.setAge(35);
		pp.setGender('M');

		pp.printInfo();

		pp.setName("vicky");
		pp.setAge(35);
		pp.setGender('M');

		pp.printInfo();
		*/

		BankAccount bk = new BankAccount();

		bk.setAccountnumber("1231 2342 4564 5675");
		bk.setBalance(2450000.00);
		bk.setOwner("Vicky");

		bk.depositAmount(2550000.00);
		bk.withdrawAmount(53750.00);
		bk.printStatement();
	}

}
