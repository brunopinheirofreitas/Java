import java.math.BigDecimal;

public class JoaquimStoreProduct {
	
	protected String productName; 
	protected int productSize;
	protected BigDecimal productValue;
	protected int productType; 
	/*
	 * FORMAL_SHOE(1), BOOT(2), TENNIS(3), SANDAL(4), CASUAL_SHOE(5);
	 */
	protected int gender;
	/*
	 * MALE(1), FEMALE(2), NO_GENDER(3);
	 */
	protected int productQuantity;
	protected int productID;

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
	
	public int getProductID (int productType, int productSize, int gender, String productName) {
		if (productType == this.productType && productSize == this.productSize && gender == this.gender && productName == this.productName) {
			return this.productID;
		} else {
			return -1;
		}
	}
	
	public String getProduct (int productID) {
		if (productID == this.productID) {
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
		} else {
			return ("Product not found!");
		}

	}
	
	public BigDecimal getProductValue (int productID) {
		return this.productValue;		
	}
	
	public void setProductQuantity (int productID, int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public int getProductQuantity (int productID) {
		return this.productQuantity;
	}
	
	public void productSell (int productID) {
		if (this.productQuantity == 0) {
			return;
		} else {
			this.productQuantity--;
		}
	}
	
}	
