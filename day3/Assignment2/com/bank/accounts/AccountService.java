package com.bank.accounts;

public class AccountService {
	protected int accountNumber;
	protected double balance;
	public AccountService (int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void createAccount() {
		System.out.println("Account created...");
	}
	public void accountDetails () {
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Balance: " + this.balance);
	}
}