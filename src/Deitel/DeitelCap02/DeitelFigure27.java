import java.util.Scanner; 


public class DeitelFigure27 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //What this do?
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		System.out.print("Enter second number: ");
		number2 = input.nextInt(); 
		sum = number1 + number2; 
		
		System.out.printf("Sum is %d%n", sum);
	}

}
