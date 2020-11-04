import java.math.BigDecimal;

public abstract class JoaquimStoreColaborator {
	
	private String colaboratorFamilyName;
	private String colaboratorName;
	private BigDecimal colaboratorGrossIncome;
	private int colaboratorIdNumber; 

	public JoaquimStoreColaborator() {

	}
	
	/*
	 * public abstract void setColaboratorFamilyName (); public abstract String
	 * getColaboratorFamilyName (); public abstract void setColaboratorName ();
	 * public abstract String getColaboratorName ();
	 */
	
	public abstract void setColaboratorFullName ();
	public abstract String getColaboratorFullName ();	
	public abstract void setColaboratorGrossIncome ();
	public abstract BigDecimal getColaboratorGrossIncome ();
	public abstract void setColaboratorIdNumber ();
	public abstract int getColaboratorIdNumber ();
	
	
	
}

