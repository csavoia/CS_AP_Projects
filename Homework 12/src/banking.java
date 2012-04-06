import java.util.*;

class BankAccount{

	public String username;
	public int balance;
	public static String bankName;
	public static double interestRate;
	
	//default constructor
	public BankAccount(){
		username = "Anonymous";
		balance = 40200;
		bankName = "Default";
		interestRate = 2.5;
	}
	
	//constructor
	public BankAccount( String newUsername, int newBalance, String newBankName, double newInterestRate ){
		username = newUsername;
		balance = newBalance;
		bankName = newBankName;
		interestRate = newInterestRate;	
	}
	
	public void deposit(int depositAmount) {
		balance += depositAmount;
	}
	public void withdraw(int withdrawAmount) {
		balance -= withdrawAmount;
	}
	public void username(String newUsername) {
		username = newUsername;
	}
	public void bank(String newBank) {
		bankName = newBank;
	}
	public void interest(double interestChange) {
		interestRate = interestChange;
	}
	
	public String toString() {
		return username + ", $" + balance + ", " + bankName + " bank, " + interestRate + "% interest rate";
	}

}

public class banking {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		
		BankAccount[] customer = new BankAccount[3];
		customer[0] = new BankAccount();
		customer[1] = new BankAccount( "Alex", 40000, "", 3.0);
		customer[2] = new BankAccount( "Bob", 2500, "Goldestein's", 20.25);

		while(true){
		
		//display main info
		for( int i = 0; i < customer.length; i++){
			System.out.println( "User " + (i+1) + ": " + customer[i] + "\n");
			
		}
		
		//ask which user to edit
		System.out.println("What user would you like to view/edit?");
		int customerNumber = in.nextInt();
		
		while( customerNumber == 1 || customerNumber == 2 || customerNumber == 3){
			 
			System.out.println("You have chosen to edit customer " + customerNumber + ".\n");
			//display customer info
			System.out.println( customer[customerNumber-1] + "\n" + "What would you like to do?\n1. Deposit Money\n2. Withdraw Money\n3. Change Name\n4. Change Bank Name\n5. Change Interest Rate\n6. Main Menu\n");
			
			int menuSelection = in.nextInt();
			
			//deposit
			if(menuSelection == 1){
				System.out.println("How much would you like to deposit?");
				int depositValue = in.nextInt();
				customer[customerNumber-1].deposit(depositValue);
			}
			//withdraw
			if(menuSelection == 2){
				System.out.println("How much would you like to withdraw?");
				int withdrawValue = in.nextInt();
				customer[customerNumber-1].withdraw(withdrawValue);
			}
			//name
			if(menuSelection == 3){
				System.out.println("What would you like to change this user's name to?");
				String newUsername = in.next();
				customer[customerNumber-1].username(newUsername);
			}
			//bank
			if(menuSelection == 4){
				System.out.println("What would you like to change this user's bank to? Only enter one word- 'bank' will be appended!");
				String newBank = in.next();
				customer[customerNumber-1].bank(newBank);
			}
			//interest
			if(menuSelection == 5){
				System.out.println("What would you like to change the interest rate to?");
				double interestChange = in.nextDouble();
				customer[customerNumber-1].interest(interestChange);
			}
			if(menuSelection == 6){
				customerNumber = 0;
			}
		}
		
		}
	}
}