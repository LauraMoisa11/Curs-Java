package homeworkCurs5;

import java.util.Scanner;

public class TernaryOperatorEx {

	public static void main(String[] args) {
		
		int factura;
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Intruduceti suma facturii :");
		factura =  scan.nextInt();
		
		
		double result;
		result = (factura>100) ? factura * 10.0/100 : factura * 5.0/100;
		System.out.println("Discountul este de: " + result);
		
		
		
		/*metoda cu if-else
		 * double x;
		
		x = (factura>100) ? factura : 10.0/100;
		System.out.println(x);
		
		if(factura>100) {
			x= factura * 10.0/100;
		}else{
			x= factura * 5.0/100;
			
		}
		*/
		

	}

}
