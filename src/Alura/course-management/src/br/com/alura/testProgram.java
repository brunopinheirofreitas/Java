package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program javaColections = new Program("Understanding Collections in Java", "Bruno Freitas");

		//javaColections.getClasses().add(new Class("Introduction to Java", 50)); //Let's create a method for this.
		javaColections.setClassesToProgram("Introduction to Java", 55);
		javaColections.setClassesToProgram("Exampes in C++", 15);
		javaColections.setClassesToProgram("Assuring C# is cool", 120);
		javaColections.setClassesToProgram("Crying with Python", 48);
		System.out.println("Using the proper object");
		System.out.println("Program: " + javaColections.getName());
		System.out.println("Class: " + javaColections.getClasses().toString());
				
		//Basical form of adding classes:
		//List<Class> classes = javaColections.getClasses();
		//classes.add(new Class("Introduction to Java", 50));
		System.out.println("Using unmodifiableList");
		List<Class> unmodfiableClasses = javaColections.getClasses(); //Can't change a thing because of the unmodifiableList.
		//unmodfiableClasses.add(new Class("java and Oracle", 120));//it'll not work because of the unmodifiableList.
		System.out.println("Program: " + javaColections.getName());
		System.out.println("Class: " + unmodfiableClasses);
		
		//How handle unmodifiableList withou changing the unmodifiableList in the motherClass
		System.out.println("Using ArrayList Constructor");
		List<Class> mutableClasses = new ArrayList<>(unmodfiableClasses);
		Collections.sort(mutableClasses);
		System.out.println(mutableClasses);
		
		//Creating a new method to return the total time of classes
		System.out.println("Total time of classes: " + javaColections.getTotalTiming());
		

//Foreach with classes object
//		for (Class class1 : classes) {
//			System.out.println("Class: " + class1.toString());
//		}

	}

}
