
public class JoaquimStoreSaleReturn {
	
	JoaquimStoreSale productSale;
	
	//Constructor
	
	public JoaquimStoreSaleReturn (JoaquimStoreSale productSale) {
		this.productSale = productSale;
	}
	
	//Methods
	
	public void setProductSale (JoaquimStoreSale productSale) {
		this.productSale = productSale;
	}
	
	public JoaquimStoreSale getProductSale () {
		return this.productSale;
	}
	
	public void setProductReturn (boolean saleReturn) {
		this.productSale.setSaleReturn(saleReturn);
	}

}
