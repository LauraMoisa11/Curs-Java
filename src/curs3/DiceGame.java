package curs3;

import java.util.Scanner;

public class DiceGame {
	/*
	 * Facem un joc cu zaruri. Regulile sunt urmatoarele:
	 * daca userul da in total : 2, 6, 12 pierde jocul. jocul se termina.
	 * daca userul da in total: 7 , 11 castiga. jocul se termina.
	 * daa userul da in total: 3,10. repeta aruncarea automat.jocul continua
	 * daca da oricare din combinatiile de zar care nu au fost scrise mai sus
	 * il intrebam daca mai da o data. rapsunsul este un boolean (Treu/False)
	 * 
	 * 
	 */


	public static void main(String[] args) {
		
		//0.0 - 0.9
	
		
		
		boolean condition = true;
		while(condition) {
			
			int dice1 = (int) (Math.random() *6+1);
			int dice2 = (int) (Math.random() *6+1);
			int sum  = dice1 + dice2;
			System.out.println("Ai dat: " + sum);
			
			if(sum ==2 || sum == 6 || sum == 12) {
				System.out.println("Imi pare rau. Ai dat : " + sum + " Ai pierdut!");
				break;
			}else if (sum ==7 || sum == 11) {
				System.out.println("Felicitari!. Ai dat : " + sum + " Ai Castigat!");
				break;
			}else if(sum ==3 || sum == 10) {
				System.out.println("Ai dat : " + sum  + " Automat mai dai o data!");
				break;
			}
			
			System.out.println("Mai vrei sa dai o data?");
			Scanner scan= new Scanner(System.in);
			condition = scan.nextBoolean();
		
		}
		
		System.out.println("Game over ! ");
	}

}
