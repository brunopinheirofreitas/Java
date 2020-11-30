
public enum ProductType {

	FORMAL_SHOE(1), BOOT(2), TENNIS(3), SANDAL(4), CASUAL_SHOE(5);
	
	private int value;
	
	ProductType (int value) {
		this.value = value;
	}
	
	public int getValue () {
		return this.value;
	}
	 

}
