package com.java.bank.accounts;

interface AccountService {
	void open();
	void close();
	void withdraw(double amount);
	void deposit(double amount);
	void balance();
}