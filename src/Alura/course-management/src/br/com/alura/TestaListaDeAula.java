package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		Class a1 = new Class ("Revisitando as ArrayList", 21);
		Class a2 = new Class ("Listas de Objetos", 15);
		Class a3 = new Class ("Relacionamento de listas e objetos", 14);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(a1);
		classes.add(a2);
		classes.add(a3);
		
		System.out.println(classes);
		
		//Collections only work because Class.java implements COmparable interface and the CompareTo method is defined.
		Collections.sort(classes);
		
		System.out.println(classes);
		
		//Using other information to order
		
		Collections.sort(classes, Comparator.comparing(Class::getTempo));
		
		System.out.println(classes);
		
		
		
	}

}
