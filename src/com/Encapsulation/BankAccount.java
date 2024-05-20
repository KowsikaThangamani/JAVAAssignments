package com.Encapsulation;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String owner;

	public String getAccountnumber() {
		return accountNumber;
	}

	public void setAccountnumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void depositAmount (double deposit) {
		balance = balance+deposit;
		System.out.println("Balance after deposit : " + balance);
	}

	public void withdrawAmount (double withdrawl) {
		balance = balance-withdrawl;
		System.out.println("Balance after withdrawal : " + balance);
	}

	public void printStatement() {
		System.out.println("Account number : " + accountNumber) ;
		System.out.println("Balance : " + balance);
		System.out.println("Owner : " + owner);
	}


}
