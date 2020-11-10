import java.math.BigDecimal;

public class JoaquimStoreSale {
	
	JoaquimStoreProduct productSale;
	JoaquimStoreVendor vendorSale;
	JoaquimStoreClient clientSale;
	private String saleDescription;
	private boolean saleReturn = false;
	
	//Constructor
	public JoaquimStoreSale (JoaquimStoreProduct product, JoaquimStoreVendor vendor, JoaquimStoreClient client, String saleDescription) {
		this.productSale = product;
		this.vendorSale = vendor;
		this.clientSale = client;
		this.saleDescription = saleDescription;
		this.productSale.setProductSell();
		BigDecimal colaboratorVariableIncome = this.productSale.getProductValue().multiply(new BigDecimal(this.vendorSale.getMaxVariableIncome()));
		this.vendorSale.setColaboratorVariableIncome(colaboratorVariableIncome);
		this.productSale.setProductDiscount(this.vendorSale.getMaxVariableIncome());
	}

	//Methods
	
	public boolean getSaleReturn () {
		return this.saleReturn;
	}
	
	public void setSaleReturn (boolean saleReturn) {
		this.saleReturn = saleReturn;
		int returnProduct = this.productSale.getProductQuantity()+1;
		this.productSale.setProductQuantity(returnProduct);
	}
	
	public void setVendorProductDiscount (JoaquimStoreVendor vendor, int password, double discount) {
		this.productSale.setProductDiscountVendor(discount, vendor, password);
	}
	
	public void setManagerProductDiscount (JoaquimStoreManager manager, int password, double discount) {
				this.productSale.setProductDiscountManager(discount, manager, password);
	}

	public String getProductSold () {
		return this.productSale.getProductInfo();
	}
	
	public BigDecimal getProductPrice () {
		return this.productSale.getProductValue();
	}
	
	public BigDecimal getProductDiscount () {
		return this.productSale.getProductDiscount();
	}
	
	public BigDecimal getProductFinalPrice () {
		return this.productSale.getProductFinalPrice();
	}
	
	public String getSaleDescription () {
		return this.saleDescription;
	}
	
	public int getSaleVendor () {
		return this.vendorSale.getColaboratorIdNumber();
	}
	
	public int getSaleClient () {
		return this.clientSale.getClientID();
	}

	public JoaquimStoreProduct getProductSale() {
		return productSale;
	}

	public void setProductSale(JoaquimStoreProduct productSale) {
		this.productSale = productSale;
	}

	public JoaquimStoreVendor getVendorSale() {
		return vendorSale;
	}

	public void setVendorSale(JoaquimStoreVendor vendorSale) {
		this.vendorSale = vendorSale;
	}

	public JoaquimStoreClient getClientSale() {
		return clientSale;
	}

	public void setClientSale(JoaquimStoreClient clientSale) {
		this.clientSale = clientSale;
	}

	public void setSaleDescription(String saleDescription) {
		this.saleDescription = saleDescription;
	}
	
	
}