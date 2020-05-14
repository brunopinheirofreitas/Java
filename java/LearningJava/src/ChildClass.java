
public class ChildClass extends MotherClass {
	
//	A class can only extends another one, hence, there is no multiple inheritance in Java. 
//	You must know how to desgin classes...it's the most important thing to a clear e great code.

	private String major; //A child class can have different attributes.
	private float weight;


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void setWeight (float weight) {
		super.setWeight(weight); //super means I am using something from the superClass
		
	}
}

