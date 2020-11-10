import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public abstract class JoaquimStoreColaborator {

	protected String colaboratorFamilyName;
	protected String colaboratorName;
	protected Date colaboratorBirthDate;
	protected BigDecimal colaboratorGrossIncome;
    protected int colaboratorIdNumber;
	protected BigDecimal colaboratorVariableIncome = new BigDecimal (0);
	
	//Constructor
	public JoaquimStoreColaborator (String familyName, String name, Date birthdate, BigDecimal grossIncome) {
		this.colaboratorFamilyName = familyName;
		this.colaboratorName = name;
		this.colaboratorBirthDate = birthdate;
		this.colaboratorGrossIncome = grossIncome;
		this.colaboratorIdNumber++;
	}

	//Methods
	
	public String getColaboratorInformation() {
			return ("Colaborator full name: " + this.colaboratorName + " " + this.colaboratorFamilyName + " Birthdate: " + this.colaboratorBirthDate);
	}

	public BigDecimal getColaboratorVariableIncome() {
		return colaboratorVariableIncome;
	}

	public void setColaboratorVariableIncome(BigDecimal colaboratorVariableIncome) {
		this.colaboratorVariableIncome = (this.colaboratorVariableIncome.add(colaboratorVariableIncome));
	}

	public int getColaboratorIdNumber() {
			return this.colaboratorIdNumber;
	}

	public String getColaboratorFamilyName() {
		return colaboratorFamilyName;
	}

	public void setColaboratorFamilyName(String colaboratorFamilyName) {
		this.colaboratorFamilyName = colaboratorFamilyName;
	}

	public String getColaboratorName() {
		return colaboratorName;
	}

	public void setColaboratorName(String colaboratorName) {
		this.colaboratorName = colaboratorName;
	}

	public Date getColaboratorBirthDate() {
		return colaboratorBirthDate;
	}

	public void setColaboratorBirthDate(Date colaboratorBirthDate) {
		this.colaboratorBirthDate = colaboratorBirthDate;
	}

	public BigDecimal getColaboratorGrossIncome() {
		return colaboratorGrossIncome;
	}

	public void setColaboratorGrossIncome(BigDecimal colaboratorGrossIncome) {
		this.colaboratorGrossIncome = colaboratorGrossIncome;
	}

}
