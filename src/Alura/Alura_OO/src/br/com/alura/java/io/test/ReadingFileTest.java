package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFileTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//Reading file 		
		FileInputStream fis = new FileInputStream("client.txt"); //sonClass of InputStream
		InputStreamReader isr = new InputStreamReader(fis); //sonClass of Reader
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		

	}

}
