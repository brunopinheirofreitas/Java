package br.com.alura.java.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import bytebank.*;

public class SerializationTest {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		cliente.setNome("Bruno Freitas");
		cliente.setProfissao("Gamer");
		cliente.setCpf("12345678900");
		Conta cc = new ContaCorrente(4613, 2005);
		cc.deposita(5000);
		cc.setTitular(cliente);
		System.out.println(cc.getSaldo());
		
		
		//String name = "Bruno Freitas";
		//Inserting an object in a file
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.bin"));
//		String name = (String)ois.readObject();
//		Cliente cliente = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente.getNome());
		
		
		
		

	}

}
