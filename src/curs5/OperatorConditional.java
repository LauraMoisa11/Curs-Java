package curs5;

import java.util.Scanner;

public class OperatorConditional {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Please insert first number :");
		num1 =  scan.nextInt();
		System.out.println("Please insert second number :");
		num2 = scan.nextInt();
		 
		//result = (conditie) ? expresie1: expresie2
		//result = (num1>=0) ? "Num1 is positiv": "Num is negative"
		
		
		String result;
		result = (num1>=0) ? "Num1 is positive" : "Num1 is negative";
		System.out.println(result);
		
		
		result = (num2>=0) ? "Num1 is positive" : "Num2 is negative";
		System.out.println(result);
		
		result = (num1>=0 && num2>=0) ? "Both are positive" : "At least one is negative";
			System.out.println(result);
			
		result = (num1 == num2) ? "Numbers ar equal" : (num1>num2)? "Num2 is the smallest" : "Num1 is the smallest";
		System.out.println(result);
		
		
	
	}

}
