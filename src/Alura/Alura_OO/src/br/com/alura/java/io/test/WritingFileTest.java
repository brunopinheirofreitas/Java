package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WritingFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Writing file 		
				FileOutputStream fis = new FileOutputStream("client2.txt"); //sonClass of InputStream
				OutputStreamWriter isr = new OutputStreamWriter(fis); //sonClass of Reader
				BufferedWriter br = new BufferedWriter(isr);
				String account = "12060010002005689";
				String client = "Talitha Rosa";
				String clientID = "05156945287";
				br.write(account);
				br.newLine();
				br.write(client);
				br.newLine();
				br.write(clientID);
				br.close();
	}

}
