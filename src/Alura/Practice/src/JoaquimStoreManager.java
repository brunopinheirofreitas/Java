import java.math.BigDecimal;
import java.util.Date;

public class JoaquimStoreManager extends JoaquimStoreColaborator implements JoaquimColaboratorCashierPassword, JoaquimColaboratorDiscountPassword {

	private ColaboratorCashierAutentication passwordChasier;
	private ColaboratorDiscountAutentication passwordDiscount;
	static final double maxDiscount = 0.15;
	int[] vendorID;

	//Constructor	
	public JoaquimStoreManager(String familyName, String name, Date birthdate, BigDecimal grossIncome) {
		super(familyName, name, birthdate, grossIncome);
	}
	
	//Method	
	public void setVendorTeam(int position, int vendorID) {
		this.vendorID[position] = vendorID;
	}
	
	public int[] getManagerTeam () {
		return this.vendorID;
	}
	
	@Override
	public void setDiscountPassword(int password) {
		this.passwordDiscount.setColaboratorPassword(password);		
	}

	@Override
	public boolean getDiscountPasswordAutentication(int password) {
		return this.passwordDiscount.colaboratorSystemAutentication(password);
	}

	@Override
	public void setCashierPassword(int password) {
		this.passwordChasier.setColaboratorPassword(password);
		
	}

	@Override
	public boolean getCashierPasswordAutentication(int password) {
		return this.passwordChasier.colaboratorSystemAutentication(password);
	}	
	

}
