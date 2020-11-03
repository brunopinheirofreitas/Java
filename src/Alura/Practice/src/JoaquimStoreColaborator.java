import java.math.BigDecimal;

public abstract class JoaquimStoreColaborator {
	
	private String colaboratorFamilyName;
	private String colaboratorName;
	private BigDecimal colaboratorGrossIncome;

	public JoaquimStoreColaborator() {

	}
	
	public abstract void setColaboratorFamilyName ();
	public abstract String getColaboratorFamilyName ();
	public abstract void setColaboratorName ();
	public abstract String getColaboratorName ();
	public abstract void setColaboratorGrossIncome ();
	public abstract BigDecimal getColaboratorGrossIncome ();
	
	
	
}

