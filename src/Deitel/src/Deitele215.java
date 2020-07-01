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
		System.out.print("Insira o primeiro número: ");
		firstNumberCalc = input.nextInt();
		System.out.println();
		System.out.print("Insira o segundo número: ");
		secondNumberCalc = input.nextInt();
		System.out.printf("Os numeros inseridos foram: %d e %d%n", firstNumberCalc, secondNumberCalc);
		System.out.println("Qual operação?");
		System.out.println("1- (+) Soma");
		System.out.println("2 - (-) Subtração");
		System.out.println("3 - (*) Multiplicação");
		System.out.println("4 - (/) Divisão");
		System.out.print("Informe: ");
		operator = input.nextInt();
		if (operator == 1) {
			resultCalc = firstNumberCalc + secondNumberCalc;
			System.out.printf("O resultado da operação %d entre os números %d e %d é: %d%n", operator, firstNumberCalc, secondNumberCalc, resultCalc);
		} else if (operator == 2) {
			resultCalc = firstNumberCalc - secondNumberCalc;
			System.out.printf("O resultado da operação %d entre os números %d e %d é: %d%n", operator, firstNumberCalc, secondNumberCalc, resultCalc);
		} else if (operator == 3) {
			resultCalc = firstNumberCalc * secondNumberCalc;
			System.out.printf("O resultado da operação %d entre os números %d e %d é: %d%n", operator, firstNumberCalc, secondNumberCalc, resultCalc);
		} else if (operator == 4) {
			resultCalc = firstNumberCalc / secondNumberCalc;
			System.out.printf("O resultado da operação %d entre os números %d e %d é: %d%n", operator, firstNumberCalc, secondNumberCalc, resultCalc);
		} else {
			System.out.println("Operador inválido.");
		}
		
		
	}

}
