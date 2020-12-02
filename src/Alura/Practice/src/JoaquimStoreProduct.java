import java.math.BigDecimal;

public class JoaquimStoreProduct {
	
	private String productName; 
	private int productSize;
	private BigDecimal productValue;
	private BigDecimal productDiscount= new BigDecimal(0);
	private double discountValue;
	private ProductType productType; 
	private Gender gender;
	private int productQuantity;
	private int productID;

	//Constructor
	public JoaquimStoreProduct (String productName, int productSize, BigDecimal productValue, ProductType productType, Gender gender) {
				this.productName = productName;
				this.productSize = productSize;
				this.productValue = productValue;
				this.productType = productType;
				this.gender = gender;
				this.productID++;
}
	
	//Methods
	
	public void setProductDiscount (double discount) {
		this.discountValue = discount/100;
		BigDecimal priceDiscount = this.productValue.multiply(new BigDecimal(this.discountValue));
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
			return ("Product: " + this.productName + " Size: " + this.productSize + " Value: " + this.productValue + " Type: " + productType.name() + " Gender: " + gender.name() + " Quantity: " + this.productQuantity);
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
	
	public void setProductSell (JoaquimStoreProduct product) {
		if (this.productQuantity > 0) {
			this.productQuantity--;
		} else {
			throw new ProductSellException(product);
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

	public String getProductType() {
		return productType.name();
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public String getGender() {
		return gender.name();
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}	
