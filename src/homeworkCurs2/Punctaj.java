package homeworkCurs2;

import java.util.Scanner;

public class Punctaj {
	
	int punctajIntrodus;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Va rog introduceti punctajul: ");
		punctajIntrodus = scan.nextInt();
		scan.close();
}
	
	
	public void verificaPunctaj (int punctajTest) {
		askTheUser();
		if(punctajIntrodus >= 0 && (punctajIntrodus <= 65)) {
			System.out.println("Ai picat. Mai incearca!");
		}else {
			System.out.println("Felicitari, ai trecut!");
			
			
		}
	}

}
