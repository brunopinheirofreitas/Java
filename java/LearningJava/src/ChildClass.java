
public class ChildClass extends MotherClass {

	String major; //A child class can have different attributes.
	float weight;

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

