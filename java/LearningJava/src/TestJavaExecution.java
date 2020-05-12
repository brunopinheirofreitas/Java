
public class TestJavaExecution {

	public static void main(String[] args) { //main is the major class in java.
		MotherClass testSetGetters = new MotherClass(); //testSetGetters is a MotherClass type. This is called to instantiate a class.
		testSetGetters.setAge(34);
		System.out.println(testSetGetters.getAge()); //println log information
		ChildClass testSetGetterChild = new ChildClass();
		testSetGetterChild.setMajor("Engineering");
		System.out.println(testSetGetterChild.getMajor());
		//Access attribute value direct from the type
		System.out.println("I'm accessing this value direct from the attribute because it is not protected: " + testSetGetters.age);
		int agechange; 
		agechange = 98;
		testSetGetters.age = agechange;
		System.out.println("I've changed the age without using a method: " + testSetGetters.age);
		// that's why attributes should be private or protected.
		MotherClass testPolimorphism = new ChildClass(); //testPolimorphism has all attributes and methods from both classes.
		testPolimorphism.set

	}

}
