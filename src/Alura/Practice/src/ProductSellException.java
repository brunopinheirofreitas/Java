
public class ProductSellException extends RuntimeException {
	
	//Trying to sell a product with zero quantity
	
	public ProductSellException (JoaquimStoreProduct product) {
		System.out.println("There's " + product.getProductQuantity() + " " + product.getProductName() + " in the storage.");
	}
	
	

}
