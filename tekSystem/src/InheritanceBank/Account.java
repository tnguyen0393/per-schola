package InheritanceBank;

public class Account extends Bank{
	double balance;

	public Account(String branchLocation) {
		super(branchLocation);
		this.balance = 0;
	}

	@Override
	public void checkBalance() {
		System.out.println("The current balance is " + this.balance);
	}
	
	
	
}
