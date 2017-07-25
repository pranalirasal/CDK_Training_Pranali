package com.java.bank.implementation;

import com.java.bank.customers.CustomerService;
import com.java.bank.accounts.AccountService;

class CustomerServiceImpl implements CustomerService extends AccountService {
	String name;
	int accountNumber;
	double balance;
	String address;
	String mobile;
	
	public void details(){
		System.out.println("Name: " + this.name);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Balance: " + this.balance);
		System.out.println("Address: " + this.address);
		System.out.println("Mobile: " + this.mobile);
	}
	void updateAddress(String address){
		this.address = address;
	}
	void updateMobile(String mobile){
		this.mobile = mobile;
	}
}

