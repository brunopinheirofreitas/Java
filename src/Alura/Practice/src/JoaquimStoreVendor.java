import java.math.BigDecimal;
import java.util.Date;

public class JoaquimStoreVendor extends JoaquimStoreColaborator implements JoaquimColaboratorDiscountPassword {

	ColaboratorDiscount passwordDiscount = new ColaboratorDiscount();
	static final double maxDiscount = 0.05;
	private double maxVariableIncome = 0.025;
	private JoaquimStoreManager manager;
	
	//Constructor
	public JoaquimStoreVendor(String familyName, String name, String birthdate, BigDecimal grossIncome) {
		super(familyName, name, birthdate, grossIncome);

	}
	
	//Method
	
	public void setVendorManager (JoaquimStoreManager manager) {
		this.manager = manager;
	}
	
	public JoaquimStoreManager getVendorManager () {
		return manager;
	}
	
	public double getMaxVariableIncome() {
		return maxVariableIncome;
	}

	public void setMaxVariableIncome(double maxVariableIncome) {
		this.maxVariableIncome = maxVariableIncome;
	}

	public static double getVendorMaxDiscount () {
		return maxDiscount;
	}
	
	@Override
	public void setDiscountPassword(int password) {
		this.passwordDiscount.setColaboratorPassword(password);		
	}

	@Override
	public boolean getDiscountPasswordAutentication(int password) {

		return this.passwordDiscount.colaboratorSystemAutentication(password);
	}
	
	

}
