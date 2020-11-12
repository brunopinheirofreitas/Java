import java.math.BigDecimal;
import java.util.Date;

public class JoaquimStoreManager extends JoaquimStoreColaborator implements JoaquimColaboratorCashierPassword, JoaquimColaboratorDiscountPassword {

	private ColaboratorCashier passwordChasier = new ColaboratorCashier();
	private ColaboratorDiscount passwordDiscount = new ColaboratorDiscount();
	static final double maxDiscount = 0.15;
	static int maxVendorPerManager = 4;
	JoaquimStoreVendor[] vendorID = new JoaquimStoreVendor[maxVendorPerManager];
	private double maxVariableIncome = 0.02;

	//Constructor	
	public JoaquimStoreManager(String familyName, String name, String birthdate, BigDecimal grossIncome) {
		super(familyName, name, birthdate, grossIncome);
	}
	
	//Method	
	
	public int getMaxVendorPerManager() {
		return this.maxVendorPerManager;
	}
	
	public void setMaxVendorPerManager(int maxVendorPerManager) {
		this.maxVendorPerManager = maxVendorPerManager;
		
	}
	
	public double getManagerMaxDiscount () {
		return maxDiscount;
		
	}
	
	public void setVendorTeam(int position, JoaquimStoreVendor vendor) {
		if (position <= maxVendorPerManager) {
			this.vendorID[position] = vendor;
		}
	}
	
	public JoaquimStoreVendor[] getManagerTeam () {
		return this.vendorID;
	}
	
	public JoaquimStoreVendor getVendorManager (JoaquimStoreVendor vendor) {
		for (int i=0; i <= maxVendorPerManager; i++) {
			if (this.vendorID[i]==vendor) {
				return vendorID[i];
			} 
		}
		return null;
	}
	
	public double getManagerMaxVariableIncome () {
		return this.maxVariableIncome;
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
