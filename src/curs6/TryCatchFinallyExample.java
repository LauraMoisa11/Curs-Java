package curs6;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		try {
			
			String nume = null;
			System.out.println(nume.length());
			
		}catch(NullPointerException e) {
			
			System.out.println("Null pointer occured");
			e.printStackTrace();
			
		}finally {
			
			System.out.println("Finally block of code");
			
		}

	}

}
