import java.util.Scanner;

public class Deitele215 {
	
	public static void main(String[] args) {
		
		int firstNumberCalc; //first number informed by user
		int secondNumberCalc; //second number informed by user
		int resultCalc; //result of calculation
		int operator; //operator of the calculation
		
		Scanner input = new Scanner(System.in); //creating an Scanner object
		
		System.out.println("Calculadora simples do bruno");
		System.out.println("****************************");
		System.out.println();
		System.out.print("Insira o primeiro n�mero: ");
		firstNumberCalc = input.nextInt();
		System.out.println();
		System.out.print("Insira o segundo n�mero: ");
		secondNumberCalc = input.nextInt();
		System.out.printf("Os numeros inseridos foram: %d e %d%n", firstNumberCalc, secondNumberCalc);
		System.out.println("Qual opera��o?");
		System.out.println("1- (+) Soma");
		System.out.println("2 - (-) Subtra��o");
		System.out.println("3 - (*) Multiplica��o");
		System.out.println("4 - (/) Divis�o");
		System.out.print("Informe: ");
		operator = input.nextInt();
		if (operator == 1) {
			resultCalc = firstNumberCalc + secondNumberCalc;
			System.out.printf("O resultado da opera��o %d entre os n�meros %d e %d �: %d%n", operator, firstNumberCalc, secondNumberCalc, resultCalc);
		} else if (operator == 2) {
			resultCalc = firstNumberCalc - secondNumberCalc;
			System.out.printf("O resultado da opera��o %d entre os n�meros %d e %d �: %d%n", operator, firstNumberCalc, secondNumberCalc, resultCalc);
		} else if (operator == 3) {
			resultCalc = firstNumberCalc * secondNumberCalc;
			System.out.printf("O resultado da opera��o %d entre os n�meros %d e %d �: %d%n", operator, firstNumberCalc, secondNumberCalc, resultCalc);
		} else if (operator == 4) {
			resultCalc = firstNumberCalc / secondNumberCalc;
			System.out.printf("O resultado da opera��o %d entre os n�meros %d e %d �: %d%n", operator, firstNumberCalc, secondNumberCalc, resultCalc);
		} else {
			System.out.println("Operador inv�lido.");
		}
		
		
	}

}
