package br.com.alura;

public class Student {
	
	private String name;
	private int id;
	
	public Student(String name, int id) {
		if (name == null) {
			throw new NullPointerException();
		}
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) { //overriding object.class method to compare using my references
		Student otherStudent = (Student) obj;
		return this.name.equals(otherStudent.name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}
	
}
