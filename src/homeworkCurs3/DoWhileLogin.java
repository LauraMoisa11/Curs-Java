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

			i++;

			System.out.println("Please enter your user:");
			userIntrodus = scan.next();
			System.out.println("Please enter your password:");
			passIntrodus = scan.nextInt();
			if (userIntrodus.equals(user) && passIntrodus == (password)) {
				System.out.println("Login Successful!");
				break;
			} else if (!userIntrodus.equals("TestUser") && passIntrodus != (1234)) {
				System.out.println("Login Error!");
			}else if (userIntrodus.equals("TestUser") && passIntrodus != (1234)) {
				System.out.println("Login Error!");
			}else if (!userIntrodus.equals("TestUser") && passIntrodus == (1234)) {
				System.out.println("Login Error!");
				
			}

		} while ((!userIntrodus.equals("TestUser") && passIntrodus != (1234) && i++ <= 3));
		System.out.println("Maximum attempts reached. User blocked!");
		
		
	
	}

}
