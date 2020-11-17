
public class ColaboratorDiscount {
	
	int colaboratorPassword;
	
	public void setColaboratorPassword (int password) {
		if(password != 0) {
			this.colaboratorPassword = password;
		}
	}
	
	public boolean colaboratorSystemAutentication (int password) {
		if(password != 0) {
			if (this.colaboratorPassword == password) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
