
/*Program that return information about what the user inserted in keyboard.*/

import java.util.Scanner;

public class DeitelFigure214 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); //Creating an Scanner object
		int number1;
		int number2;
		
		System.out.print("Enter first integer: "); //asking user for a number
		number1 = input.nextInt(); //variable receiving data from keyboard
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		if (number1 == number2) {
			System.out.printf("%d == %d%n", number1, number2); //evaluating the data inserted by user
		}
		if (number1 != number2) {
			System.out.printf("%d != %d%n", number1, number2); //evaluating the data inserted by user
		}
		if (number1 < number2) {
			System.out.printf("%d < %d%n", number1, number2); //evaluating the data inserted by user
		}
		if (number1 > number2) {
			System.out.printf("%d > %d%n", number1, number2); //evaluating the data inserted by user
		}
		if (number1 <= number2) {
			System.out.printf("%d <= %d%n", number1, number2); //evaluating the data inserted by user
		}
		if (number1 >= number2) {
			System.out.printf("%d >= %d%n", number1, number2); //evaluating the data inserted by user
		} 

	} // end main

}//end class
