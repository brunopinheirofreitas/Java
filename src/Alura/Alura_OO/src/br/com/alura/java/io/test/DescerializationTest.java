package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import bytebank.*;

public class DescerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		//String name = (String)ois.readObject();
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		//Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cc.getTitular().getNome() + ", " + cc.getSaldo());

	}

}
