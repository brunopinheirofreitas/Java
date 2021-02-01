package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Program {

	private String name;
	private String instructor;
	private List<Class> classes = new ArrayList<Class>();
	private Set<Student> student = new HashSet<>();
	private Map<Integer, Student> studentEnrolled = new HashMap<>();

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
		this.studentEnrolled.put(studentConfirmed.getId(), studentConfirmed);
	}
	
	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(student);
	}

	public boolean getStudenEnrolled(Student student) {
		return this.student.contains(student);
	}
	
	public Student findStudentById (int id) {
		
//Using map
		return studentEnrolled.get(id);
		
		
		
//		for (Student specificStudent : student) { //Simple way o write 
//			if(specificStudent.getId() == id) {
//				return specificStudent;
//			}
//		}
//		throw new NoSuchElementException("Id not foud: " + id); 
		//return null;
	}
	

}
