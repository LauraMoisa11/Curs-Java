package homeworkCurs3;

import java.util.Scanner;

public class DoWhileLogin {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String user = "TestUser";
		int password = 1234;
		String userIntrodus;
		int passIntrodus;

		int i = 0;

		do {


			System.out.println("Please enter your user:");
			userIntrodus = scan.next();
			System.out.println("Please enter your password:");
			passIntrodus = scan.nextInt();
			
			if (userIntrodus.equals(user) && passIntrodus == (password)) {
				System.out.println("Login Successful!");
				break;
			} else if (i<2) {
				System.out.println("Login Error!");
			i++;
				
			}
			
			else {
				System.out.println("Maximum attempts reached. User blocked!");
				break;
			}

		} while ( i < 3);
		
	
	}

}
