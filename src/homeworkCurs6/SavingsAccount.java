package homeworkCurs6;

public class SavingsAccount extends Account {

	public SavingsAccount(Customer accountOwner, int balance, int accountNumber) {
		super(accountNumber, balance, accountOwner);
		
		
	}

	@Override
	public void withdraw(int amount) throws InsufficientFundsException {
		if(balance <= amount) {
			
			throw new InsufficientFundsException("Insuficient funds for transaction");
			
		}else {
			balance = balance-amount;
			System.out.println("Please pick your money. Your new balance is : " + balance);
		}	
		
	}

}
