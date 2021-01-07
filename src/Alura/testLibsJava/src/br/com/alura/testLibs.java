package br.com.alura;

import bytebank.Conta;
import bytebank.ContaCorrente;

public class testLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new ContaCorrente (123, 321);
		
		c.deposita(500);
		
		System.out.println(c.getSaldo());

	}

}
