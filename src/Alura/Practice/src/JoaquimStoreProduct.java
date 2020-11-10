import java.math.BigDecimal;

public class JoaquimStoreProduct {
	
	private String productName; 
	private int productSize;
	private BigDecimal productValue;
	private BigDecimal productDiscount= new BigDecimal(0);
	private double discountValue;
	private int productType; 
	/*
	 * FORMAL_SHOE(1), BOOT(2), TENNIS(3), SANDAL(4), CASUAL_SHOE(5);
	 */
	private int gender;
	/*
	 * MALE(1), FEMALE(2), NO_GENDER(3);
	 */
	private int productQuantity;
	private int productID;

	//Constructor
	public JoaquimStoreProduct (String productName, int productSize, BigDecimal productValue, int productType, int gender) {
		if (productType <= 5 || productType >= 1 && gender >= 1 || gender <= 3) {
				this.productName = productName;
				this.productSize = productSize;
				this.productValue = productValue;
				this.productType = productType;
				this.gender = gender;
				this.productID++;
	}
}
	
	//Methods
	
	public void setProductDiscount (double discount) {
		this.discountValue = discount;
		BigDecimal priceDiscount = this.productValue.multiply(new BigDecimal(discount));
		this.productDiscount = priceDiscount;
	}
	
	public BigDecimal getProductFinalPrice () {
		BigDecimal finalPrice = this.productValue.subtract(this.productDiscount);
		return finalPrice;
	}

	
	public void setProductDiscountVendor (double productDiscount, JoaquimStoreVendor vendor, int password) {
		if (vendor.getDiscountPasswordAutentication(password)) {
			this.setProductDiscount(productDiscount);
		}
	}
	
	public void setProductDiscountManager (double productDiscount, JoaquimStoreManager manager, int password) {
		if (manager.getDiscountPasswordAutentication(password)) {
			this.setProductDiscount(productDiscount);
		}
	}
	
	public int getProductID () {
		return this.productID;
	}
	
	public String getProductInfo () {
			String productType = null; 
			switch (this.productType) {
			case 1: 
				productType = "FORMAL_SHOE";
				break;
			case 2:
				productType = "BOOT";
				break;
			case 3:
				productType = "TENNIS";
				break;
			case 4:
				productType = "SANDAL";
				break;
			case 5:
				productType = "CASUAL_SHOE";
				break;
			}
			String gender = null;
			switch (this.gender) {
			case 1:
				gender = "MALE";
				break;
			case 2:
				gender = "FEMALE";
				break;
			case 3:
				gender = "NO_GENDER";
				break;
			}
			
			return ("Product: " + this.productName + " Size: " + this.productSize + " Value: " + this.productValue + " Type: " + productType + " Gender: " + gender + " Quantity: " + this.productQuantity);
	}
	
	public BigDecimal getProductValue () {
		return this.productValue;		
	}
	
	public void setProductValue (BigDecimal productValue) {
		this.productValue = productValue;
	}
	
	public BigDecimal getProductDiscount () {
		return this.productDiscount;		
	}
	
	public void setProductQuantity (int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public int getProductQuantity () {
		return this.productQuantity;
	}
	
	public void setProductSell () {
		if (this.productQuantity != 0) {
			this.productQuantity--;
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductSize() {
		return productSize;
	}

	public void setProductSize(int productSize) {
		this.productSize = productSize;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
}	
