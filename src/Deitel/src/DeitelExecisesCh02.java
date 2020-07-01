//Program that calculates the multiplication of three integers 

import java.util.Scanner;

public class DeitelExecisesCh02 {

	public static void main(String[] args) {

		int x; //variable that receives data from user
		int y; //variable that receives data from user
		int z; //variable that receives data from user
		int result; //variable that outcome of a mathematical expression

		Scanner input = new Scanner(System.in); //Creating an object input of Scanner
		
		System.out.println("Calculator of products!");
		
		System.out.print("Please insert a number: ");
		x = input.nextInt(); //storing information inserted by user
		System.out.print("Please insert a number: ");
		y = input.nextInt(); //storing information inserted by user
		System.out.print("Please insert a number: ");
		z = input.nextInt(); //storing information inserted by user
		
		result = x*y*z; //Calculating the formula
		
		System.out.printf("Product is: %d%n", result);
		
	} //end of main
} //end of class
