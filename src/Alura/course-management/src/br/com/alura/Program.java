package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	private String name;
	private String instructor;
	private List<Class> classes = new ArrayList<Class>();

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
	

}
