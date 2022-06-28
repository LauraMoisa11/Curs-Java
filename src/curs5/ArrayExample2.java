package curs5;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		String[] orase = {"Iasi", "Cluj", "Arad", "Alba"}; 

		for(int i = 0; i<orase.length; i++) {
			System.out.println(orase[i]);
		}
				//for each
		for(String oras : orase) {
			System.out.println(oras);
		}
	}

}
