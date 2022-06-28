package curs5;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[]textArray = new String[5];
		//String[] textArray = {null, null, null, null, null};
		//index of array 		0		1	2		3	4
		
		
		textArray [0] = "This ";
		//String[] textArray = {This, null, null, null. null};
		textArray[1] = "is ";
		textArray[2] = "an ";
		textArray[3] = "Array ";
		textArray[4] = "!";
		
		
		System.out.println(textArray[0]);
		//for clasic
		for(int i = 0; i<textArray.length; i++) {
			System.out.print(textArray[i]);
		}
		//for each
		for(String element : textArray) {
			System.out.print(element);
		}
	}

}
