package com.constructor;

public class BankAccount {

	String accountNumber;
	double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void depositAmount (double deposit) {
		balance = balance+deposit;
		System.out.println("Balance after deposit : " + balance);
	}

	public void withdrawAmount (double withdraw) {
		balance = balance-withdraw;
		System.out.println("Balance after withdraw : " + balance);
	}

	public static void main(String[] args) {

		BankAccount obj = new BankAccount("1122 3123 4567 8990", 145000.0);
		obj.depositAmount(50000.0);
		obj.withdrawAmount(20000.0);
		obj.depositAmount(10000.0);
		obj.withdrawAmount(75000.0);
		obj.depositAmount(500.0);
		obj.withdrawAmount(200.0);


	}

}
