package homeworkCurs2;

import java.util.Scanner;

public class VerificaVarsta {
	
	int varsta;
	
	
	public void askTheUSer() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Va rog introduceti varsta:");
		varsta = scan.nextInt();
		scan.close();
	
	}
	
	public void checkAge() {
		askTheUSer();
		if(varsta < 18) {
			System.out.println("Esti minor.");
		}else if(varsta <= 65 && varsta >= 18){
			System.out.println("Esti adult.");
		}else if(varsta > 65) {
			System.out.println("Esti batran.");
		
		}else {
			System.out.println("Introdu o varsta valida!");
		}
	}
}
