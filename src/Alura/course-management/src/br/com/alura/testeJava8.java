package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testeJava8 {

	public static void main(String[] args) {
		
		List<Program> classes = new ArrayList<Program>();
		List<Student> students = new ArrayList<Student>();
		classes.add(new Program("Programming Language", "Donatelo"));
		classes.get(0).setClassesToProgram("C++", 12);		
		classes.get(0).setClassesToProgram("Java", 200);
		classes.get(0).setClassesToProgram("Ruby", 100);
		classes.get(0).setClassesToProgram("Assembly", 78);
		students.add(new Student("Marco Aurelio", 1520));
		students.add(new Student("Theodoro Sampaio", 8463));
		students.add(new Student("Zelia Duncan", 4521));
		students.add(new Student("Adalberto Botelho", 0105));
		for (Student student : students) {
			classes.get(0).seatConfirmed(student);
		}
		
		
		System.out.println("----------Using Java 8 to sort with lambdas and method reference-----------");
		List<Student> studentInClass = new ArrayList<Student>();
		studentInClass = classes.get(0).getStudents();
		List<String> studentName = new ArrayList<String>();
		for (Student student : studentInClass) {
			studentName.add(student.getName());
		}
		studentName.sort(Comparator.comparing(String::length));
		studentInClass.forEach(System.out::println); //Method References doesn't allow you to use getName
		studentInClass.forEach(c -> System.out.println(c.getName()));
		
		System.out.println("----------Using Java 8 Streams-----------");
		
		studentInClass.stream()
			.filter(c -> c.getId() > 1000)
			.forEach(c -> System.out.println(c.getName()));
		
		List<Class> classesProgram = new ArrayList<Class>();
		classesProgram = classes.get(0).getClasses();
		classesProgram.stream()
			.filter(a -> a.getTempo() >= 100)
			.map(Class::getTempo)
			.forEach(System.out::println);
			
		
		
		

	}

}
