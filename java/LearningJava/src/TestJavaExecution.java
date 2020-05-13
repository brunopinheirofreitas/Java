
public class TestJavaExecution {

	public static void main(String[] args) { //main is the major class in java.
		
		//This instance doesn't work anymore due to the creation of constructors for the MotherClass. Once created a constructor, the default constructor is overrid. You have to set it manually.
		MotherClass testSetGetters = new MotherClass(); //testSetGetters is a MotherClass type. This is called to instantiate a class.
		testSetGetters.setAge(34);
		System.out.println("Test setter: " + testSetGetters.getAge()); //println log information
		
		//Constructor
		
		MotherClass testConstructor = new MotherClass("John Lenon", 32);
		System.out.println("Test constructor with getter: " + testConstructor.getName());
		System.out.println("Test constructor with getter: " + testConstructor.getAge());
		
		
		ChildClass testSetGetterChild = new ChildClass();
		testSetGetterChild.setMajor("Engineering");
		System.out.println("Test getter: " + testSetGetterChild.getMajor());
		
		//Access attribute value direct from the type
		System.out.println("I'm accessing this value direct from the attribute because it is not protected: " + testSetGetters.age);
		int agechange; 
		agechange = 98;
		testSetGetters.age = agechange;
		System.out.println("I've changed the age without using a method: " + testSetGetters.age);
		// that's why attributes should be private or protected.
		double testaConversao = 1500.50;
		int converte = (int) testaConversao; //This is called CASTING
		System.out.println("Eu sou um double: " + testaConversao);
		System.out.println("Eu sou um double convertido em int: " + converte); //This is called Concatenation 

		//Test static attribute
		System.out.println("The total of employee created - testSetGetters: " + testSetGetters.getTotal());
		System.out.println("The total of employee created - testConstructor: " + testConstructor.getTotal());
		System.out.println("The total of employee created - testSetGetterChild: " + testSetGetterChild.getTotal());
		
		//Flow control 

		int control = 0;
		int controlWhile = 0;
		String definition; 

		for (int counter =0; counter < 3; counter++) {
			if (counter == 2) {
				break;
			}
			System.out.println("I'm inside the FOR with count: " + counter);
			while (controlWhile < 2) {
				System.out.println("I'm inside the While with controlWhile: " + controlWhile);
				if (control == 0) {
					definition = "I'm inside the if with control: " + control;
					System.out.println(definition);
				}
				else {
					definition = "I'm inside the else with control: " + control;
					System.out.println(definition);
				}
				controlWhile++;
				control++;
			}
		}


		//MotherClass testPolimorphism = new ChildClass(); //testPolimorphism has all attributes and methods from both classes.


	}

}
