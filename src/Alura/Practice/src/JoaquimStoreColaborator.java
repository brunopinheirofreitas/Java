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
	protected BigDecimal colaboratorVariableIncome;
	
	public JoaquimStoreColaborator (String familyName, String name, Date birthdate, BigDecimal grossIncome) {
		this.colaboratorFamilyName = familyName;
		this.colaboratorName = name;
		this.colaboratorBirthDate = birthdate;
		this.colaboratorGrossIncome = grossIncome;
		this.colaboratorIdNumber++;
	}

	public String getColaboratorInformation(int idNumber) {
		if (idNumber == colaboratorIdNumber) {
			return ("Colaborator full name: " + colaboratorName + " " + colaboratorFamilyName + " Birthdate: " + this.colaboratorBirthDate);
		} else {
			return null;
		}
	}

	public BigDecimal getColaboratorGrossIncome(int idNumber) {
		if (idNumber == colaboratorIdNumber) {
			return colaboratorGrossIncome;
		} else {
			return null;
		}
	}

	public int getColaboratorIdNumber(String familyName, String name, Date birthDate) {
		if (familyName == colaboratorFamilyName && name == colaboratorName && colaboratorBirthDate == birthDate) {
			return colaboratorIdNumber;
		} else {
			return 0;
		}
	}

}
