import java.math.BigDecimal;
import java.util.Date;

public class JoaquimStoreCashier extends JoaquimStoreColaborator implements JoaquimColaboratorCashierPassword {

	private ColaboratorCashier passwordChasier;
	
	//Constructor
	public JoaquimStoreCashier(String familyName, String name, String birthdate, BigDecimal grossIncome) {
		super(familyName, name, birthdate, grossIncome);
	}
	
	//Method
	@Override
	public void setCashierPassword(int password) {
		this.passwordChasier.setColaboratorPassword(password);
		
	}

	@Override
	public boolean getCashierPasswordAutentication(int password) {
		return this.passwordChasier.colaboratorSystemAutentication(password);
	}
	
	

}
