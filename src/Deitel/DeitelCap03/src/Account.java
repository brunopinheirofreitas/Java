
public class Account {
	
	private String name; // Instance variable 
	private double balance; //instance variable
	
	//Constructor that requires a name everytime this class is instantiated. 
	public Account(String name, double balance) {
		this.name = name;
		
		//The instance variable balance is initializade default by 0.0, hence if user types 0.0 the variable assume the default value instead of the value typed by user.
		if (balance > 0.0) {
			this.balance = balance;
		}
		
	}
	
	//Method to set the name of the object
	public void setName(String name) {
		this.name = name;
	}
	
	//Method to retrieve the name of the object
	public String getName()
	{
		return name; //Return the name of the object
	}
	
	//Method that add balance to an account
	public void deposit (double depositAmount) {
		if (depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}
		
	//Method that returns the balance of an account
	public double getBalance() {
		return balance;
	}
		
	

} // end of class
