package com.bank.branches;
import com.bank.accounts.AccountService;

public class BranchService extends AccountService{
	String IFSCCode;
	
	public BranchService (String IFSCCode, int accountNumber, double balance) {
		super(accountNumber, balance);
		this.IFSCCode = IFSCCode;
	}
	public void accountDetails () {
		super.accountDetails();
		System.out.println("Branch Code is: " + IFSCCode);
	}
}