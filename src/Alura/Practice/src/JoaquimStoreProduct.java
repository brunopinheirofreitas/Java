import java.math.BigDecimal;

public class JoaquimStoreProduct {
	
	private String productName; 
	private BigDecimal productValue;
	private int productType; 
	/*
	 * FORMAL_SHOE(1), BOOT(2), TENIS(3), SANDAL(4), CASUAL_SHOE(5);
	 */
	private int gender;
	/*
	 * MALE(1), FEMALE(2), NO_GENDER(3);
	 */
	private int productQuantity;

	//Constructor
	public JoaquimStoreProduct (String productName, BigDecimal productValue, int productType, int gender) {
		this.productName = productName;
		this.productValue = productValue;
		this.productType = productType;
		this.gender = gender;
	}
	
	//Methods
	public String getProduct (int productType, int gender) {
		if (productType > 5 || productType < 1) {
			final String message = "It's not a valid product type";
					return message;
		} else if (gender < 1 || gender > 3) {
			final String message = "It's not a valid product type";
			return message;
		}
		return this.productName;
	}
	
	public BigDecimal getProductValue (String productName) {
		return this.productValue;		
	}
	
	public void setProductQuantity (int productType, int gender, String productName, int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public int getProductQuantity (int productType, int gender, String productName) {
		return this.productQuantity;
	}
	
	public int productSold (int productType, int gender, String productName) {
		if (this.productQuantity == 0) {
			return -1;
		} else {
			this.productQuantity--;
		}
		return this.productQuantity;
	}
	
}	
