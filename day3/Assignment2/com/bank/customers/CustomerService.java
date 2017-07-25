package com.bank.customers;
import com.bank.accounts.AccountService;

public class CustomerService extends AccountService{
	String custName;
	double balance;
	public CustomerService (String custName, int accountNumber, double balance) {
			super(accountNumber, balance);
			this.custName = custName;
	}
	
	public void accountDetails () {
			super.accountDetails();
			System.out.println("Customer Name: " + custName);
	}
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("" + amount + " deposited successfully.");
	}
	public void withdraw(double amount) {
		if (amount > this.balance)
			System.out.println("You are low on balance. Try depositing some amount.");
		else
			System.out.println("" + amount + " debbited successfully.");
	}
}