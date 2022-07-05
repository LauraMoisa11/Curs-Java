package homeworkCurs6;

import java.util.Scanner;

public class TestAtm {
	

	public static void main(String[] args) throws InsufficientFundsException {
		
		Customer customer = new Customer("Ion", "Iasi", "ion@mail.com");
		SavingsAccount savings = new SavingsAccount(customer, 2000, 35432); 
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi " + customer.getName() +  " Please enter the amount to witdraw :");
		int amount = scan.nextInt();

		//savings.withdraw(amount);
		try {
			savings.withdraw(amount);
			
		}catch(InsufficientFundsException e) {
			System.out.println("The amount you entered is greater than the available balance :" + savings.balance);
				
			
		}finally {
			System.out.println("Thank you for using our ATM!");
		}
}
	
}
