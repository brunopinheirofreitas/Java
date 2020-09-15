package Cap06Ex66;

import java.util.Scanner;

public class MainSphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius;
		double volume;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the SphereVolume calculator!");
		System.out.print("Please insert the radius of the sphere you want to calculate the volume to: ");
		radius = input.nextDouble();
		volume = SphereVolume.CalculateSphereVolume(radius);
		System.out.printf("The volume of a sphere with radius %.2f is %.2f%n", radius, volume);		

	}

}
