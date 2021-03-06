package InheritanceBank;

public class Bank {
	public static String bankName = "Bank of America";
	String branchLocation;
	
	public Bank(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	
	public static void changeBank(String bankName) {
		Bank.bankName = bankName;
		System.out.println("The bank is now " + Bank.bankName);
	}
	
	public void checkLocation() {
		System.out.println("The current branch location is " + this.branchLocation);
	}
	
	public void changeLocation(String location) {
		System.out.println("The branch location is changed from " + this.branchLocation + " to " + location);
		this.branchLocation = location;
	}
	
	public void checkBalance() {
		System.out.println("You need to create an account to check the balance");
	}
	
}
