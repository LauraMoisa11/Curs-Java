package homeworkCurs5;

import java.util.Scanner;


public class Arrays {


public static void main(String[] args) {
	
		int numar;
	
		Scanner scan  = new Scanner(System.in);
		
		

		
		String[]luni = new String[13];
		luni [0] = "Ianuarie";
		luni [1] = "Februarie";
		luni [2] = "Martie";
		luni [3] = "Aprilie";
		luni [4] = "Mai";
		luni [5] = "Iunie";
		luni [6] = "Iulie";
		luni [7] = "August";
		luni [8] = "Septembrie";
		luni [9] = "Octombrie";
		luni [10] = "Noiembrie";
		luni [11] = "Decembrie";
		
		do {
			System.out.println("Te rog introdu un numar intre 1 si 12 :");
			numar =  scan.nextInt();
			
			if(numar >0 && numar <= 12) {
				System.out.println(luni[numar-1]);
				break;
			
			}else {
				
				System.out.println("Numarul este invalid. Te rog introdu un alt numar : ");
				numar = scan.nextInt();
				continue;
				
				
			} }while(numar > luni.length);
	
		
		
	
		
}
}
		


	


