package br.com.alura.java.io.test;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ReadingCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Reading a csv
		Scanner scanner = new Scanner(new File("contas.csv"));
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.println(line);
			
			//Spliting
			
			String[] valores = line.split(","); //cutting commas
			System.out.println(valores[1]);
			
			//Dellimiter
			Scanner lineScanner = new Scanner(line);
			lineScanner.useLocale(Locale.CANADA);
			lineScanner.useDelimiter(",");
			int position0 = lineScanner.nextInt();
			String position1 = lineScanner.next();
			//Parsing to bigdecimal a value
			double position2 = lineScanner.nextDouble();
			System.out.println("Position 0: " + position0);
			System.out.println("Position 1: " + position1);
			System.out.println("Position 2: " + position2);
			lineScanner.close();
		}
		scanner.close();
		
		
		
		
		
		

	}

}
