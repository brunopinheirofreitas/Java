package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class CopyingFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Reading file
		FileInputStream fis = new FileInputStream("client.txt"); //sonClass of InputStream, System.in reads from keyboard.
		InputStreamReader isr = new InputStreamReader(fis); //sonClass of Reader
		BufferedReader br = new BufferedReader(isr);
		//Writing file 		
		FileOutputStream out = new FileOutputStream("client3.txt"); //sonClass of InputStream
		OutputStreamWriter wri = new OutputStreamWriter(out); //sonClass of Reader
		BufferedWriter wtr = new BufferedWriter(wri);
		//Writing a new file
		String line = br.readLine();
		while (line != null) {
			wtr.write(line);
			wtr.newLine();
			line = br.readLine();
		}
		br.close();
		wtr.close();
		
		//Proper classes to print on filw
		//FileOutputStream out1 = new FileOutputStream("client4.txt"); //sonClass of InputStream
		//OutputStreamWriter wri1 = new OutputStreamWriter(out1); //sonClass of Reader
		//BufferedWriter wtr1 = new BufferedWriter(wri1);
		FileWriter fw = new FileWriter("client4.txt");
		fw.write("Name: Natasha"); //You can use BufferedWriter as well.
		//fw.write("\r\n"); it works
		fw.write(System.lineSeparator());
		fw.write("Age: 17");
		fw.write(System.lineSeparator());
		fw.write("Fleed home");
		fw.close();
		
		//PrintStream
		
		PrintStream ps = new PrintStream("client5.txt");
		ps.println("Name: Rubinho PedeChinelo");
		ps.println();
		ps.println("Position: car racer");
		ps.close();
		


	}

}
