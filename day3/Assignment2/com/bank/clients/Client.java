import com.bank.customers.CustomerService;
import com.bank.branches.BranchService;

class Client {
	public static void main(String[] args){
		CustomerService cust = new CustomerService("Pranali");
		cust.accountDetails();
		cust.deposit(2000.00);
		cust.withdraw(500.00);
		
		BranchService branchService = new BranchService("123SFDF");
		branchService.accountDetails();
	}
}