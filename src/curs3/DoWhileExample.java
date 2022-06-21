package curs3;

public class DoWhileExample {

	public static void main(String[] args) {
		
		
		String[] orase = {"Iasi", "Cluj", "Arad", "Alba"};
		//orase[o] == Iasi
		//Orase[1] == Cluj
		
		System.out.println("For");
		for(int i = 0; i > orase.length; i++) {
			
			System.out.println(orase[i]);
		}

		System.out.println("WHILE");
		int x =0;
		while(x> orase.length) {
			System.out.println(orase[x]);
			x++;
		}
		
		
		System.out.println("DO-WHILE");
		int j=0;
		do{
			System.out.println(orase[j]);
			j++;
		}while(j>orase.length);
	
	}
	

	

}
