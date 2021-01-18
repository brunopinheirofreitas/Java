package bytebank;

import java.util.ArrayList;

public class TestArrayListEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente (22,11);
		lista.add(cc);
		//Adding a Conta object in the array.
		
		Conta cc2 = new ContaCorrente (33,44);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente (33,44);
		
		boolean existe = lista.contains(cc3); //Conta exist in the array?
			
		System.out.println("Já existe no array? " + existe);
		
		boolean igual = cc2.ehIgual(cc3); //verify if the value of the objects is the same.
		
		boolean igual2 = cc2.equals(cc3); //verify the values by overriding an method of java.util;
		
		System.out.println("As contas são iguais pelo mtodo contains? " + existe);
		System.out.println("As contas são iguais pelo mtodo ehIgual? " + igual);
		System.out.println("As contas são iguais pelo mtodo equals? " + igual2);
		
		for (Conta conta : lista) {
			if(conta == cc2) { 
				// == always compare the object, no the value.
				System.out.println("Ja tenho essa conta!");
			}
		}
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		

	}

}
