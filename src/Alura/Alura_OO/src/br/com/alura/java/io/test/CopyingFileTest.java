package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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


	}

}
