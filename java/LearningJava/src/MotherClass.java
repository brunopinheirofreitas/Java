
//A class can be:
	//public - any part of the code can access it
	//abstract - it cannot be instantiated, it only influentiate extended classes;

public class MotherClass {

	//Atributes are variables inside a class
	int age;
	String name;
	double heigh; 
	float weight;
	char gender; //m - masculine, f - feminie
	boolean employed;
	static int total;
	
	//Constructors: Eclipse set a default constructor, but we can define one. Constructors are important to specify certain types of variables within the class instance.
	
	public MotherClass (String name, int age) {
		this.name = name;
		this.age = age;
		MotherClass.total++;
	}
	
	public MotherClass() {
		MotherClass.total++;
		
	}
	

	// An attribute can be:
		// public - any part of the code can access it
		// protected - only extended classes can see it
		// private - only the proper class can see it



//Methods are "functions" that allows other parts of the code to manage variables. 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeigh() {
		return heigh;
	}
	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight; //this. means I am using the variable that are being informed where the method is invoked.
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isEmployed() {
		return employed;
	}
	public void setEmployed(boolean employed) {
		this.employed = employed;
	} 
	public int getTotal() {
		return total;
	}

}