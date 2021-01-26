package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestingLists {
	
	public static void main(String[] args) {
		String aula1 = "Knowing more about lists";
		String aula2 = "Modeling the class class";
		String aula3 = "Working with sets and courses";
		
		ArrayList<String> classes = new ArrayList<>();
		classes.add(aula1);
		classes.add(aula2);
		classes.add(aula3);
		System.out.println("Printing everything");
		System.out.println(classes);
		System.out.println("Printing using short for");
		for (String aula : classes) {
			System.out.println("Program: " + aula);
			
		}
		System.out.println("Printing using get");
		System.out.println("First position: " + classes.get(0));
		System.out.println("Printing using for");
		for (int i = 0; i<classes.size(); i++) {
			System.out.println("aula: " + classes.get(i));
		}
		classes.forEach(aula -> {
			System.out.println("Using foreach: ");
			System.out.println("Program: " + aula);
			}		); //lambda
		
		System.out.println("Using Class collections");
		
		classes.add("Applying java in day to day life");
		System.out.println("Without ordering: " + classes);
		Collections.sort(classes);
		System.out.println("Applying ordering: " + classes);
		
		
				
	}

}
