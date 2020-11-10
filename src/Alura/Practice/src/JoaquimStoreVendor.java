import java.math.BigDecimal;
import java.util.Date;

public class JoaquimStoreVendor extends JoaquimStoreColaborator implements JoaquimColaboratorDiscountPassword {

	ColaboratorDiscountAutentication passwordDiscount;
	static final double maxDiscount = 0.05;
	private int vendorManager;
	private double maxVariableIncome = 0.025;
	
	//Constructor
	public JoaquimStoreVendor(String familyName, String name, Date birthdate, BigDecimal grossIncome) {
		super(familyName, name, birthdate, grossIncome);

	}
	
	//Method
	
	public int getVendorManager () {
		return this.vendorManager;
	}
	
	public double getMaxVariableIncome() {
		return maxVariableIncome;
	}

	public void setMaxVariableIncome(double maxVariableIncome) {
		this.maxVariableIncome = maxVariableIncome;
	}

	public void setVendorManager (JoaquimStoreManager manager) {
		this.vendorManager = manager.getColaboratorIdNumber();
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
