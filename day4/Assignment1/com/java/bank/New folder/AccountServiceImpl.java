package com.java.bank.implementation;

import com.java.bank.accounts.AccountService;

class AccountServiceImpl implements AccountService {
	double balance;
	public void open() {
		System.out.println("Account created...");
	}
	public void close() {
		System.out.println("Account closed...");
	}
	public void withdraw(double amount) {
		if (this.balance < amount)
			this.balance -= amount;
		else
			System.out.println("You're low on balance.");
	}
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void balance() {
		System.out.println("Account balance: " + this.balance);
	}
}