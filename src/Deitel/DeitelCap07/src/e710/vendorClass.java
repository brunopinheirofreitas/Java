package e710;

import java.math.BigDecimal;

public class vendorClass {
	
	private int salesQuantity = 0;
	private final static BigDecimal staticVendorIncome = new BigDecimal(200.00);
	BigDecimal [] salesValues = new BigDecimal [salesQuantity];
	
	//Constructor
	public vendorClass (int salesQuantity) {
		this.salesQuantity = salesQuantity;
	}
	
	//Setter to the values of the array
	public void setSalesValues (int salePosition, BigDecimal salesValue) {
		
    	this.salesValues[salePosition] = salesValue;	    	
}
			
	//getter salesQuantity	
	public int getSalesQuantity () {
		return this.salesQuantity;
	}
	
	public BigDecimal getGrossVendorIncome () {
		BigDecimal totalSalesValue;
		//Return 200 + 9% of the sales.
		
	}
}