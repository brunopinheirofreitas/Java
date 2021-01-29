package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program {

	private String name;
	private String instructor;
	private List<Class> classes = new ArrayList<Class>();
	private Set<Student> student = new HashSet<>();

	public Program(String name, String instructor) {
		super();
		this.name = name;
		this.instructor = instructor;
	}

	public String getName() {
		return name;
	}

	public String getInstructor() {
		return instructor;
	}
	
	public List<Class> getClasses() {
		return Collections.unmodifiableList(classes);
	}
	
	public String setClassesToProgram (String classDescription, int time) {
		this.classes.add(new Class(classDescription, time));
		return "Class creation success";
	}
	
	public int getTotalTiming() {
		int totalTime = 0;
		for (Class class1 : classes) {
			totalTime += class1.getTempo();
		}
		return totalTime;
	}
	
	public void seatConfirmed(Student studentConfirmed) {
		this.student.add(studentConfirmed);
	}
	
	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(student);
	}

	public boolean getStudenEnrolled(Student student) {
		return this.student.contains(student);
	}
	

}
