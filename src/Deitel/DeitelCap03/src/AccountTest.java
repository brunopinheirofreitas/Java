import java.util.Scanner; //importing another class

public class AccountTest {

	public static void main(String[] args) {

		// Create an object of the type Scanner 
		Scanner input = new Scanner(System.in);
		// Create an object of the type Account		
		Account myAccount = new Account("Jupiter Rosa", 0.0); 
		
		// Print the first value of the variable name. 
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		System.out.print("Please enter a name: ");
		String theName = input.nextLine(); //create a variable of the type String and ask the user to input it
		myAccount.setName(theName); //insert the value typed by the user in the instance variable
		System.out.println();
		//Print the name typed by the user and inserted in the instance variable name of the object myAccount
		System.out.printf("The name of the object is: %n%s%n", myAccount.getName());
		
		//Inserting cash into an account
		System.out.println("Insert a value to deposit:");
		double depositAmount = input.nextDouble(); //reading keyboard
		System.out.printf("%nAddiing %.2f to myAccount balance%n%n", depositAmount); //printing the amount that will be add into the account
		myAccount.deposit(depositAmount); //adding the amount into the account

		//Presenting balance
		System.out.printf("The current balance is: %.2f%n", myAccount.getBalance());
		

	}

} // end of class
