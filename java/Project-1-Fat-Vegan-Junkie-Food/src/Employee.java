/**
 * @author bruno
 * Mother class of the Fat Vegan junkie food restaurant
 */
import java.math.BigDecimal;

public abstract class Employee {

	protected String name; 
	protected int employee_code;
	protected int social_number; 
	protected String admission_date; 
	protected BigDecimal salary;
	protected String employee_address; 
	protected String telephone_number_personal;
	protected String telephone_number_emergency_contact;
	protected int designated_branch; 
	protected int position;
	protected int age;


	protected String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	protected void setName(String name) {
		this.name = name;
		System.out.println("The name of the Employee is " + this.name);

	}
	protected abstract int getEmployee_code();

	protected abstract void setEmployee_code(int employee_code);

	protected abstract int getSocial_number();

	protected abstract void setSocial_number(int social_number);

	protected abstract String getAdmission_date();

	protected abstract void setAdmission_date(String admission_date);

	protected abstract BigDecimal getSalary();

	protected abstract void setSalary(BigDecimal salary);

	protected abstract String getEmployee_adress();

	protected abstract void setEmployee_adress(String employee_address);

	protected abstract String getTelephone_number_personal();

	protected abstract void setTelephone_number_personal(String telephone_number_personal);

	protected abstract String getTelephone_number_emergency_contact();

	protected abstract void setTelephone_number_emergency_contact(String telephone_number_emergency_contact);

	protected abstract int getDesignted_branch(); 

	protected abstract void setDesignted_branch(int designated_branch); 

	protected abstract int getPosition(); 

	protected abstract void setPosition(int position); 

	protected abstract int getAge();

	protected abstract void setAge(int age);

}

