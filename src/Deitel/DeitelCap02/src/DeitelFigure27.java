//altered by cap03

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DeitelFigure27 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //What this do? This allows some methods of the class Scanner to be invoked without passing the whole method name.
		int number1;
		int number2;
		int sum;
		String firstNumberInsertedByUser;
		String secondNumberInsertedByUser;
		String resultOperation;
		
		firstNumberInsertedByUser = JOptionPane.showInputDialog("Please enter the first number");
		number1 = Integer.parseInt(firstNumberInsertedByUser);
		
		secondNumberInsertedByUser = JOptionPane.showInputDialog("Please enter the second number");
		number2 = Integer.parseInt(secondNumberInsertedByUser);
		
		sum = number1 + number2;		
		resultOperation = String.format("The result is %d", sum);
		
		JOptionPane.showMessageDialog(null, resultOperation);
				
		
//		System.out.print("Enter first number: ");
//		number1 = input.nextInt();
//		System.out.print("Enter second number: ");
//		number2 = input.nextInt(); 
//		sum = number1 + number2; 
//		
//		System.out.printf("Sum is %d%n", sum);
	}

}
