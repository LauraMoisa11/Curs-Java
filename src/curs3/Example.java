package curs3;

import java.util.Scanner;

public class Example {
	
	/*
	 * un program care intreaba userul un numar
	 * inmulteste acel numar cu 10 si il printeaza
	 * 
	 * face asta pana userul introduce 0
	 * 
	 */

	public static void main(String[] args) {
		
		int number;
		Scanner scan = new Scanner(System.in);
		scan.close();
		do {
			System.out.println("enter a number :");
			number = scan.nextInt();
			System.out.println(number*10);
		}while(number != 0);
		
		

	}

}
