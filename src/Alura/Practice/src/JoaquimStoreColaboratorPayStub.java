import java.math.BigDecimal;
public class JoaquimStoreColaboratorPayStub {
	
	//Method
	
	public static String payStubColaborator (JoaquimStoreColaborator colaborator) {
		BigDecimal totalIncome = colaborator.getColaboratorGrossIncome().add(colaborator.getColaboratorVariableIncome());
		return ("Total income is: " + totalIncome);
	}
	
}
