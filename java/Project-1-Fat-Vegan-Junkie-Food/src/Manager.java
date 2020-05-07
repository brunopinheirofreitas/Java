import java.math.BigDecimal;

/**
 * 
 */

/**
 * @author bruno
 *
 */
public class Manager extends Employee {
	
	private String name;

	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	protected void setName(String name) {
		this.name = name;
		System.out.println("The name of the Employee is " + this.name);

	}

	@Override
	public int getEmployee_code() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setEmployee_code(int employee_code) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSocial_number() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSocial_number(int social_number) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getAdmission_date() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAdmission_date(String admission_date) {
		// TODO Auto-generated method stub

	}

	@Override
	public BigDecimal getSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSalary(BigDecimal salary) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEmployee_adress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEmployee_adress(String employee_address) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTelephone_number_personal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTelephone_number_personal(String telephone_number_personal) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTelephone_number_emergency_contact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTelephone_number_emergency_contact(String telephone_number_emergency_contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getDesignted_branch() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDesignted_branch(int designated_branch) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPosition(int position) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub

	}

}
