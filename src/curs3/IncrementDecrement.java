package curs3;

public class IncrementDecrement {

	
	//operatorul increment ++ ->number++ == number + 1
	//operatorul decrement --
	public static void main(String[] args) {
		int number = 10;
		
		System.out.println(number);
		//Post increment
		System.out.println(number++);
		System.out.println(number);
		//pre increment
		System.out.println(++number);
	
		int number2 = 5;
		//pre decrement
		System.out.println(--number2);
		//post decrement
		System.out.println(number2--);
		System.out.println(number2);

	}

}
