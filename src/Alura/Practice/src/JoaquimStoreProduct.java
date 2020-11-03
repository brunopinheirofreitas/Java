import java.math.BigDecimal;

public class JoaquimStoreProduct {
	
	private String productName; 
	protected BigDecimal productValue;
	protected static enum productType {
		FORMAL_SHOE(1),
		BOOT(2),
		TENIS(3),
		SANDAL(4),
		CASUAL_SHOE(5);
	}
	protected static enum genderProduct {
		MALE(1),
		FEMALE(2),
		NO_GENDER(3);
	}
	
}	
