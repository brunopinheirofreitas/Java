
public class ColaboratorDiscountAutentication {
	
	int colaboratorPassword;
	
	public void setColaboratorPassword (int password) {
		this.colaboratorPassword = password;
	}
	
	public boolean colaboratorSystemAutentication (int password) {
		if (this.colaboratorPassword == password) {
			return true;
		} else {
			return false;
		}
	}

}
