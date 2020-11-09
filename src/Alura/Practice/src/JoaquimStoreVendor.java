import java.math.BigDecimal;
import java.util.Date;

public class JoaquimStoreVendor extends JoaquimStoreColaborator implements JoaquimColaboratorDiscountPassword {

	ColaboratorDiscountAutentication passwordDiscount;
	static final double maxDiscount = 0.05;
	
	//Constructor
	public JoaquimStoreVendor(String familyName, String name, Date birthdate, BigDecimal grossIncome) {
		super(familyName, name, birthdate, grossIncome);

	}
	
	//Method
	@Override
	public void setDiscountPassword(int password) {
		this.passwordDiscount.setColaboratorPassword(password);		
	}

	@Override
	public boolean getDiscountPasswordAutentication(int password) {

		return this.passwordDiscount.colaboratorSystemAutentication(password);
	}
	
	

}
