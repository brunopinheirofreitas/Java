import java.math.BigDecimal;
import java.util.Date;

public class JoaquimStoreManager extends JoaquimStoreColaborator implements JoaquimColaboratorCashierPassword, JoaquimColaboratorDiscountPassword {

	private ColaboratorCashierAutentication passwordChasier;
	private ColaboratorDiscountAutentication passwordDiscount;
	static final double maxDiscount = 0.15;
	int[] vendorID;
	static int maxVendorPerManager = 4;
	private double maxVariableIncome = 0.02;

	//Constructor	
	public JoaquimStoreManager(String familyName, String name, Date birthdate, BigDecimal grossIncome) {
		super(familyName, name, birthdate, grossIncome);
	}
	
	//Method	
	
	public BigDecimal getManagerVariableIncome (JoaquimStoreVendor vendor) {
		for (int i=0; i <= maxVendorPerManager; i++) {
			if (this.vendorID[i]==vendor.getColaboratorIdNumber()) {
				this.setColaboratorVariableIncome(this.getColaboratorVariableIncome().add(vendor.getColaboratorVariableIncome()));
			}
		}
		return this.getColaboratorVariableIncome();
	}
	
	public static double getManagerMaxDiscount () {
		return maxDiscount;
		
	}
	
	public void setVendorTeam(int position, JoaquimStoreVendor vendor) {
		if (position <= maxVendorPerManager) {
			this.vendorID[position] = vendor.getColaboratorIdNumber();
		}
	}
	
	public int[] getManagerTeam () {
		return this.vendorID;
	}
	
	public int getVendorManager (JoaquimStoreVendor vendor) {
		for (int i=0; i <= maxVendorPerManager; i++) {
			if (this.vendorID[i]==vendor.getColaboratorIdNumber()) {
				return super.colaboratorIdNumber;
			} 
		}
		return -1;
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
