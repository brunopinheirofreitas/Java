import javax.swing.JOptionPane; //class that creates panels

public class PanelClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generates a panel asking user to input his name
		String name = JOptionPane.showInputDialog("Please inform your name");
		// Creates a string variable with the name of the user and a text
		String message = String.format("I see, your name is %s!", name);
		// generates a panel in the screen with the variable message
		JOptionPane.showMessageDialog(null, message);

	}

}// end of class
