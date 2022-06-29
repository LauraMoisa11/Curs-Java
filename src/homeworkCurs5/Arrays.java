package homeworkCurs5;

import java.util.Scanner;


public class Arrays {


public static void main(String[] args) {
	
		int numar;
		int numar2;
	
		Scanner scan  = new Scanner(System.in);
		System.out.println("Te rog introdu un numar intre 1 si 12 :");
		numar =  scan.nextInt();
		

		
		String[]luni = new String[13];
		luni [0] = null;
		luni [1] = "Ianuarie";
		luni [2] = "Februarie";
		luni [3] = "Martie";
		luni [4] = "Aprilie";
		luni [5] = "Mai";
		luni [6] = "Iunie";
		luni [7] = "Iulie";
		luni [8] = "August";
		luni [9] = "Septembrie";
		luni [10] = "Octombrie";
		luni [11] = "Noiembrie";
		luni [12] = "Decembrie";
	
		
		
	if(numar >0 && numar <= 12) {
			System.out.println(luni[numar]);
		
		}else {
			
			System.out.println("Numarul este invalid. Te rog introdu un alt numar : ");
			numar2 = scan.nextInt();
			System.out.println(luni[numar2]);
			
			
		} 
		
}
}
		


	


