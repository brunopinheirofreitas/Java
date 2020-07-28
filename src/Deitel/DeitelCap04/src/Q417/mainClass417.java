package Q417;

import java.util.Scanner;

public class mainClass417 {

	public static void main(String[] args) {
		Fuel417 amountFuel = new Fuel417();
		Kilometrage417 amountKilometrage = new Kilometrage417();
		Scanner input = new Scanner(System.in);
		double consuption;
		int counter = 1;

		System.out.println("Welcome to FuelConsuption App");
		System.out.println("Insert 0 anytime if you want to exit");
		System.out.println("Please insert your measurements: ");
		System.out.println();

		while (counter != 0) {
			System.out.print("How many kilometers did you rode? ");
			amountKilometrage.setKilometer(input.nextInt());
			if (amountKilometrage.getKilometer() > 0) {
				System.out.println();
				System.out.print("How many galons of fuel did you put in your vehicle? ");
				amountFuel.setFuel(input.nextInt());
				if (amountFuel.getFuel() > 0) {
					consuption = amountKilometrage.getKilometer() / amountFuel.getFuel();
					System.out.println();
					System.out.printf("The consuption of fuel by your car in that travel was: %.2f%n%n", consuption);
				} else if (amountFuel.getFuel() == 0) {
					counter = amountFuel.getFuel();
				}
			} else if (amountKilometrage.getKilometer() == 0) {
				counter = amountKilometrage.getKilometer();
			}
		}

		System.out.println();
		System.out.println("Results based on the information inserted: ");
		System.out.printf("Total kilometers rode: %.2f%n", amountKilometrage.getkilomterTotal());
		System.out.printf("Total fuel consumed by your vehicle: %.2f%n", amountFuel.getFuelTotal());
	}
}
