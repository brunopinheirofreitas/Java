package br.com.alura;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> students = new HashSet<>();
		students.add("Silvio Santos");
		students.add("Marco Aurelio");
		students.add("Chuck Schuldiner");
		students.add("Kiko Loureiro");
		students.add("Choraro Charlie");
		students.add("Max Cavaleira");

		System.out.println("----------Using HashSet-----------");
		System.out.println(students);

		System.out.println("---------Using Student.Class---------");

		Program javaColections = new Program("Understanding Collections in Java", "Bruno Freitas");
		// javaColections.getClasses().add(new Class("Introduction to Java", 50));
		// //Let's create a method for this.
		javaColections.setClassesToProgram("Introduction to Java", 55);
		javaColections.setClassesToProgram("Exampes in C++", 15);
		javaColections.setClassesToProgram("Assuring C# is cool", 120);
		javaColections.setClassesToProgram("Crying with Python", 48);
		
		Student a1 = new Student("Renato Russo", 654987);
		Student a2 = new Student("Nicholal Machiavel", 95173548);
		Student a3 = new Student("Giovanni Antonelli", 8546896);
		
		javaColections.seatConfirmed(a1);
		javaColections.seatConfirmed(a2);
		javaColections.seatConfirmed(a3);
		
		System.out.println("Confirmed students of " + javaColections.getName());
		Set<Student> studentConfirmed = javaColections.getStudents();
		for (Student student : studentConfirmed) {
			System.out.println(student.getName());
		}
		
		System.out.println("------------A specific student is enrolled?-----------");
		
		System.out.println("Student " + a1.getName() + "is enrolled? " +  javaColections.getStudenEnrolled(a1));
		
		System.out.println("------------------Equals------------");
		
		Student equalsTest = new Student("Giovanni Antonelli", 8546896);
		
		System.out.println("Student equals method: " + a3.equals(equalsTest));
		System.out.println("The student " + equalsTest + " is enrolled? " + javaColections.getStudenEnrolled(equalsTest));
		
		System.out.println("-----COmpaging hashCode------------");
		System.out.println(a3.hashCode() + " is equal to " + equalsTest.hashCode());
		

	}

}
