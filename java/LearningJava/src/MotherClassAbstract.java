
//A class can be:
	//abstract - any part of the code can access it
	//abstract - it cannot be instantiated, it only influentiate extended classes;

abstract class MotherClassAbstract {
	// An attribute can be:
	// abstract - any part of the code can access it
	// abstract - only extended classes can see it
	// private - only the proper class can see it

	//Atributes are variables inside a class
	
	protected int age;
	protected String name;
	protected  double heigh; 
	protected  float weight;
	protected  char gender; //m - masculine, f - feminie
	protected  boolean employed;

	
	// Methods are "functions" that allows other parts of the code to manage variables.
	// A method can be:
	// abstract - any part of the code can access it
	// abstract - only extended classes can see it
	// private - only the proper class can see it
	// abstract - It only can be instantiated by the extended class, It do not have a body.
	
	abstract int getAge();
	abstract int setAge();
	abstract String getName();
	abstract String setName();
	abstract double setHeigh();
	abstract double getHeigh();
	abstract float setWeight();
	abstract float getWeight();
	abstract char setGender();
	abstract char getGender();
	abstract boolean setEmployed();
	abstract boolean getEmployed();


}